import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaExcluirProduto extends javax.swing.JFrame {
    String codProd;
    
    public TelaExcluirProduto() {
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
                txtNome.setText(resultado.getString("nome"));
                txtQuantidade.setText(resultado.getString("quantidade"));
                txtValor.setText(resultado.getString("valor"));
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

        txtNome = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnExcluirProduto = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblControledeEstoque = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(180, 100, 360, 40);

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(180, 150, 360, 40);

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorKeyReleased(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(180, 200, 360, 40);

        btnExcluirProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluirProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirProduto.setText("EXCLUIR PRODUTO");
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluirProduto);
        btnExcluirProduto.setBounds(180, 270, 360, 50);

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValor.setText("VALOR:");
        getContentPane().add(lblValor);
        lblValor.setBounds(100, 200, 70, 40);

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidade.setText("QUANTIDADE:");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(10, 150, 160, 40);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("NOME DO PRODUTO:");
        getContentPane().add(lblNome);
        lblNome.setBounds(20, 100, 150, 40);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("EXCLUIR PRODUTO");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(0, 0, 690, 80);

        setSize(new java.awt.Dimension(707, 390));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased

    }//GEN-LAST:event_txtNomeKeyReleased

    private void txtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtValor.requestFocus();
        }
    }//GEN-LAST:event_txtValorKeyReleased

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
                PreparedStatement st = conectado.prepareStatement("DELETE FROM produto WHERE codProd = ?;");
                st.setString(1, codProd);
                st.executeUpdate();

                JOptionPane.showMessageDialog(null, "Usuário Excluido com sucesso");
                dispose();

                conectado.close();
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }

        } else { // Resposta foi Não
            dispose();
        }
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
