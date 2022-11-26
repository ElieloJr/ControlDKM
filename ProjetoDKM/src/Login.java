
import com.mysql.cj.protocol.Resultset;
import dados.sistemadao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    private Object txtSenha;
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        lblUsuaria = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        txtSenha1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setTitle("Acesso ao Sistema");
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        lblUsuaria.setBackground(new java.awt.Color(255, 255, 255));
        lblUsuaria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuaria.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuaria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUsuaria.setText("Usuário:");
        getContentPane().add(lblUsuaria);
        lblUsuaria.setBounds(30, 180, 80, 30);

        lblSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(0, 0, 0));
        lblSenha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSenha.setText("      Senha:");
        getContentPane().add(lblSenha);
        lblSenha.setBounds(20, 230, 90, 30);

        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntrar);
        btnEntrar.setBounds(120, 280, 340, 40);

        txtSenha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenha1ActionPerformed(evt);
            }
        });
        txtSenha1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenha1KeyReleased(evt);
            }
        });
        getContentPane().add(txtSenha1);
        txtSenha1.setBounds(120, 230, 340, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 49)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DKM");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 90, 400, 40);

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
        txtUsuario.setBounds(120, 180, 340, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Control");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 50, 400, 40);

        setSize(new java.awt.Dimension(587, 445));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Entrar() {
        String usuario, senha;
        usuario = txtUsuario.getText();
        senha = txtSenha1.getText();

        if (usuario.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório prencher o campo usuário");
            txtUsuario.requestFocus();
            return; // stop
        }
        if (senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório prencher o campo senha");
            txtUsuario.requestFocus();
            return; // stop
        }
        try {
            sistemadao dao;
            dao = new sistemadao();
            ResultSet resultado = dao.validarUsusario(usuario, senha);
            
            
            //4 - Verificar se o usuário foi encontrado na tabela usuário do banco de dados.
            if (resultado.next()) {
                String nome, cargo;
                nome = resultado.getString("nome");
                cargo = resultado.getString("cargo");
                
                switch (cargo) {
                    case "Gerente" -> {
                        TelaGerente tela;
                        tela = new TelaGerente(nome, cargo);
                        tela.setVisible(true);
                    }
                    case "Caixa" -> {
                        TelaCaixa tela;
                        tela = new TelaCaixa();
                        tela.setVisible(true);
                    }
                    case "Estoquista" -> {
                        TelaEstoquista tela;
                        tela = new TelaEstoquista();
                        tela.setVisible(true);
                    }
                    default -> {
                        JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválidos");
            }
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não está na library");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
        }
    }
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Entrar();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtSenha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenha1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenha1ActionPerformed

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            txtSenha1.requestFocus();
        }
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void txtSenha1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenha1KeyReleased
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Entrar();
        }
    }//GEN-LAST:event_txtSenha1KeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuaria;
    private javax.swing.JPasswordField txtSenha1;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
