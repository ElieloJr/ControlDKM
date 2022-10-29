import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaAdicionarRemessa extends javax.swing.JFrame {
    String codProd, quantidadeAtual;
    
    public TelaAdicionarRemessa() {
        initComponents();
        codProd = JOptionPane.showInputDialog(null, "Digite o código do produto");

        if (codProd == null) { return; }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produto WHERE codProd = ?");
            st.setString(1, codProd);
            ResultSet resultado = st.executeQuery();
            
            if (resultado.next()) {
                quantidadeAtual = resultado.getString("quantidade");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário Não cadastrado");
            }
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuantidade = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        lblControledeEstoque = new javax.swing.JLabel();
        btnCadastrarProduto = new javax.swing.JButton();

        getContentPane().setLayout(null);

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(150, 120, 360, 40);

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidade.setText("QUANTIDADE:");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(10, 120, 130, 40);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("EDITAR PRODUTO");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(0, 10, 630, 80);

        btnCadastrarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarProduto.setText("ADICIONAR");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(150, 190, 360, 40);

        setSize(new java.awt.Dimension(643, 330));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        String quantidade = txtQuantidade.getText();
        Integer valorAtualizado = Integer.parseInt(quantidade) + Integer.parseInt(quantidadeAtual);
        quantidade = Integer.toString(valorAtualizado);
        
        if (quantidade.equals("")) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtQuantidade.requestFocus();
            return; 
        }
        try {
            //2 - Conectar no banco de dados sistemabd
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("UPDATE produto SET quantidade = ? WHERE codProd = ?;");
            st.setString(1, quantidade);
            st.setString(2, codProd);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Remessa adicionada com sucesso");
            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Produto Já cadastrado");
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
