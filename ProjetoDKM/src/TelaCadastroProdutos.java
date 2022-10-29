
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TelaCadastroProdutos extends javax.swing.JFrame {

    public TelaCadastroProdutos() {
        initComponents();
    }

    public TelaCadastroProdutos(String codigo, String nome, String quantidade, String valor) {
        initComponents();
        txtNome.setText(nome);
        txtQuantidade.setText(quantidade);
        txtValor.setText(valor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarProduto = new javax.swing.JButton();
        lblQuantidade = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        btnSair = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        lblControledeEstoque = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblCodigo = new javax.swing.JLabel();

        setTitle("Gerenciamento de Produtos");
        getContentPane().setLayout(null);

        btnCadastrarProduto.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrarProduto.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarProduto.setText("Cadastrar Produto");
        btnCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrarProduto);
        btnCadastrarProduto.setBounds(200, 320, 360, 50);

        lblQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblQuantidade.setForeground(new java.awt.Color(0, 0, 0));
        lblQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblQuantidade.setText("QUANTIDADE:");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(30, 200, 160, 40);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("NOME DO PRODUTO:");
        getContentPane().add(lblNome);
        lblNome.setBounds(40, 150, 150, 40);

        lblValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblValor.setText("VALOR:");
        getContentPane().add(lblValor);
        lblValor.setBounds(120, 250, 70, 40);

        txtQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(200, 200, 360, 40);

        txtValor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorKeyReleased(evt);
            }
        });
        getContentPane().add(txtValor);
        txtValor.setBounds(200, 250, 360, 40);

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
        txtNome.setBounds(200, 150, 360, 40);

        btnSair.setBackground(new java.awt.Color(153, 153, 153));
        btnSair.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Voltar");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(200, 380, 170, 30);

        btnLimpar1.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpar1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnLimpar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar1.setText("Limpar");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1);
        btnLimpar1.setBounds(390, 380, 170, 30);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("CADASTRO DE PRODUTOS");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(0, 20, 690, 80);

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoKeyReleased(evt);
            }
        });
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(200, 100, 360, 40);

        lblCodigo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 0, 0));
        lblCodigo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCodigo.setText("CODIGO DO PRODUTO:");
        getContentPane().add(lblCodigo);
        lblCodigo.setBounds(30, 100, 160, 40);

        setSize(new java.awt.Dimension(701, 474));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarProdutoActionPerformed
        String codigo, nome, quantidade, valor;
        codigo = txtCodigo.getText();
        nome = txtNome.getText();
        quantidade = txtQuantidade.getText();
        valor = txtValor.getText();

        if (codigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return;
        }
        if (nome.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return;
        }
        if (quantidade.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return;
        }
        if (valor.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtNome.requestFocus();
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("INSERT INTO produto VALUES(?,?,?,?)");

            st.setString(1, codigo);
            st.setString(2, nome);
            st.setString(3, quantidade);
            st.setString(4, valor);
            st.executeUpdate();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            
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

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed
        txtNome.setText("");
        txtQuantidade.setText("");
        txtValor.setText("");
    }//GEN-LAST:event_btnLimpar1ActionPerformed

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

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarProduto;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
