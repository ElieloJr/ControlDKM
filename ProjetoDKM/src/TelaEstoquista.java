import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TelaEstoquista extends javax.swing.JFrame {
    public TelaEstoquista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditarProduto = new javax.swing.JButton();
        btnCadastrarProduto = new javax.swing.JButton();
        btnAdicionarNovaRemessa = new javax.swing.JButton();
        lblControledeEstoque = new javax.swing.JLabel();
        btnProdutosCadastrados = new javax.swing.JButton();
        btnDeletarProduto1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        setTitle("ESTOQUISTA");
        getContentPane().setLayout(null);

        btnEditarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnEditarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnEditarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarProduto.setText("EDITAR PRODUTO");
        btnEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarProduto);
        btnEditarProduto.setBounds(60, 180, 230, 60);

        btnCadastrarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarProduto.setText("CADASTRAR PRODUTO");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(60, 100, 230, 60);

        btnAdicionarNovaRemessa.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionarNovaRemessa.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnAdicionarNovaRemessa.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionarNovaRemessa.setText("ADICIONAR NOVA REMESSA\n");
        btnAdicionarNovaRemessa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarNovaRemessaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionarNovaRemessa);
        btnAdicionarNovaRemessa.setBounds(210, 260, 240, 70);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("CONTROLE DE ESTOQUE ");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(-10, 10, 690, 80);

        btnProdutosCadastrados.setBackground(new java.awt.Color(51, 51, 51));
        btnProdutosCadastrados.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnProdutosCadastrados.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutosCadastrados.setText("PRODUTOS CADASTRADOS");
        btnProdutosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosCadastradosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProdutosCadastrados);
        btnProdutosCadastrados.setBounds(370, 100, 230, 60);

        btnDeletarProduto1.setBackground(new java.awt.Color(51, 51, 51));
        btnDeletarProduto1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnDeletarProduto1.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletarProduto1.setText("DELETAR PRODUTO");
        btnDeletarProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarProduto1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeletarProduto1);
        btnDeletarProduto1.setBounds(370, 180, 230, 60);

        jMenu1.setText("Sair ");
        jMenuBar1.add(jMenu1);

        mnuAjuda.setText("Ajuda");
        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(690, 419));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProdutoActionPerformed
        // abrirTeladeProduto("Editar");
        TelaEditarProduto tela;
        tela = new TelaEditarProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_btnEditarProdutoActionPerformed

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        TelaCadastroProdutos tela;
        tela = new TelaCadastroProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_btnCadastrarProdutoActionPerformed

    private void btnAdicionarNovaRemessaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarNovaRemessaActionPerformed
        TelaAdicionarRemessa tela;
        tela = new TelaAdicionarRemessa();
        tela.setVisible(true);
    }//GEN-LAST:event_btnAdicionarNovaRemessaActionPerformed
    private void abrirTeladeProduto(String operacaoProdutos){
        String codigo;
        codigo = JOptionPane.showInputDialog(null, "Digite o nome do produto ou o codigo");
        
        if (codigo == null) { return; }
        
        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            //3 - Buscar o usuário digitado na tabela codigo do banco de dados sistemabd;
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produto WHERE nome = ?");
            st.setString(1, codigo);

            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela codigo do banco de dados.
            if (resultado.next()) {
                //Abrir o formulário Menu.java
                String nome, quantidade, valor;

                codigo = resultado.getString("codigo");
                nome = resultado.getString("nome");
                quantidade = resultado.getString("quantidade");
                valor = resultado.getString("valor");

                TelaCadastroProdutos  tela;
                tela = new TelaCadastroProdutos (codigo, nome, quantidade, valor);
                tela.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Produto Não cadastrado");
            }

            //5 - Desconectar.
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        } 
    }
    private void btnProdutosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosCadastradosActionPerformed
        TelaProdutosCadastrados tela;
        tela = new TelaProdutosCadastrados();
        tela.setVisible(true);
    }//GEN-LAST:event_btnProdutosCadastradosActionPerformed

    private void btnDeletarProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarProduto1ActionPerformed
        TelaExcluirProduto tela;
        tela = new TelaExcluirProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_btnDeletarProduto1ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarNovaRemessa;
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnDeletarProduto1;
    private javax.swing.JButton btnEditarProduto;
    private javax.swing.JButton btnProdutosCadastrados;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JMenu mnuAjuda;
    // End of variables declaration//GEN-END:variables
}
