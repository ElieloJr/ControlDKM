
import dados.sistemadao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class TelaAdmin extends javax.swing.JFrame {

    public TelaAdmin() {
        initComponents();
        btnExcluir.setVisible(false);
        btnEditar.setVisible(false);
    }

    public TelaAdmin(String codigo, String nome, String quantidade, String valor, String operacao) {
        initComponents();
        txtUsuario.setText(codigo);
        txtSenha.setText(nome);
        txtNome.setText(quantidade);
        cmbCargo.setSelectedItem(valor);
        if (operacao.equals("Excluir")) {
            btnEditar.setVisible(false);
            btnCadastrar.setVisible(false);
            btnLimpar1.setVisible(false);
        } else if (operacao.equals("Alterar")) {
            btnCadastrar.setVisible(false);
            btnExcluir.setVisible(false);
            txtUsuario.setEnabled(false);
            btnLimpar1.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        cmbCargo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpar1 = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();

        setTitle("Gerenciamento de Pessoa");
        getContentPane().setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuario.setText("Usuário");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(80, 100, 90, 40);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(70, 280, 100, 50);

        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(180, 160, 330, 40);

        lblNome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 0, 0));
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNome.setText("Nome");
        getContentPane().add(lblNome);
        lblNome.setBounds(70, 160, 100, 40);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(180, 100, 330, 40);

        cmbCargo.setBackground(new java.awt.Color(51, 51, 51));
        cmbCargo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cmbCargo.setForeground(new java.awt.Color(255, 255, 255));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não selecionado", "Gerente", "Caixa", "Estoquista" }));
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(180, 280, 330, 50);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("GERENCIAMENTO DE USUÁRIOS");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 680, 80);

        btnCadastrar.setBackground(new java.awt.Color(51, 51, 51));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar);
        btnCadastrar.setBounds(150, 380, 120, 50);

        btnExcluir.setBackground(new java.awt.Color(51, 51, 51));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(280, 380, 120, 50);

        btnEditar.setBackground(new java.awt.Color(51, 51, 51));
        btnEditar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar);
        btnEditar.setBounds(20, 380, 120, 50);

        btnLimpar1.setBackground(new java.awt.Color(51, 51, 51));
        btnLimpar1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnLimpar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar1.setText("LIMPAR");
        btnLimpar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpar1);
        btnLimpar1.setBounds(500, 360, 140, 40);

        btnSair.setBackground(new java.awt.Color(51, 51, 51));
        btnSair.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("VOLTAR");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        getContentPane().add(btnSair);
        btnSair.setBounds(500, 410, 140, 40);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSenha.setText("Senha");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(100, 220, 70, 40);

        txtSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(txtSenha);
        txtSenha.setBounds(180, 220, 330, 40);

        setSize(new java.awt.Dimension(699, 505));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String u, s, n, c;

        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (u.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop

        }
        if (s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (n.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (c.equals("Nunhum")) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        try {
          sistemadao dao;
          dao = new sistemadao();
          dao.cadastrarUsuario(u, s, n, c);
            
           JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso");
            dispose();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Confirma?", "Confirmação", 0);
        if (resposta == 0) {
            String usuario = txtUsuario.getText();

            try {
              sistemadao dao;
              dao = new sistemadao();
              dao.excluirUsuario(usuario);

                JOptionPane.showMessageDialog(null, "Usuário Excluido com sucesso");
                dispose();
                
            } catch (ClassNotFoundException | SQLException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            }
        } else { // Resposta foi Não
            dispose();
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String u, s, n, c;

        u = txtUsuario.getText();
        s = txtSenha.getText();
        n = txtNome.getText();
        c = cmbCargo.getSelectedItem().toString();

        if (s.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (n.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (c.equals("Nunhum")) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (u.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigado prencher todos os campo");
            txtUsuario.requestFocus();
            return; // stop
        }
        try {
           sistemadao dao;
           dao = new sistemadao();
           dao.editarUsuario(u, s, n, c);

            JOptionPane.showMessageDialog(null, "Usuário Alterado com sucesso");
            dispose();

            txtSenha.setText("");
            txtNome.setText("");
            cmbCargo.setSelectedIndex(1);
            txtUsuario.setText("");
            txtUsuario.requestFocus();

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
        } catch (SQLException ex) {
            int erro = ex.getErrorCode();
            if (erro == 1062) {
                JOptionPane.showMessageDialog(null, "Usuário Já cadastrado");
                txtUsuario.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Entre em contato com o administrador do sistema e informe o erro: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btnLimpar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpar1ActionPerformed

        txtNome.setText("");
        txtSenha.setText("");
        txtUsuario.setText("");
    }//GEN-LAST:event_btnLimpar1ActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar1;
    private javax.swing.JButton btnSair;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
