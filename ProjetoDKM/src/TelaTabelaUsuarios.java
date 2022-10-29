
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaTabelaUsuarios extends javax.swing.JFrame {

    public TelaTabelaUsuarios() {
        initComponents();
        prencherTabela();
    }

    private void prencherTabela() {
        try {
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");

            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario");
            ResultSet resultado = st.executeQuery();
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        btnAtulizar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        lblCargo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();

        setTitle(" Usuários Cadastrados");
        getContentPane().setLayout(null);

        tblUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        tblUsuarios.setBorder(new javax.swing.border.MatteBorder(null));
        tblUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblUsuarios.setForeground(new java.awt.Color(51, 51, 51));
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Senha", "Nome", "Cargo"
            }
        ));
        jScrollPane2.setViewportView(tblUsuarios);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 82, 600, 440);

        btnAtulizar.setBackground(new java.awt.Color(51, 51, 51));
        btnAtulizar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAtulizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtulizar.setText("ATUALIZAR");
        btnAtulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtulizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtulizar);
        btnAtulizar.setBounds(630, 440, 200, 36);

        cmbCargo.setBackground(new java.awt.Color(51, 51, 51));
        cmbCargo.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        cmbCargo.setForeground(new java.awt.Color(255, 255, 255));
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ver Todos", "Caixa", "Gerente", "Estoquista" }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(630, 120, 200, 40);

        lblCargo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCargo.setForeground(new java.awt.Color(0, 0, 0));
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("CARGO");
        getContentPane().add(lblCargo);
        lblCargo.setBounds(630, 80, 200, 40);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TABELA DE USUÁRIOS DO SISTEMA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 850, 70);

        btnVoltar.setBackground(new java.awt.Color(51, 51, 51));
        btnVoltar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(630, 480, 200, 36);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DIGITE O NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(630, 200, 200, 40);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(630, 240, 200, 30);

        btnPesquisar.setBackground(new java.awt.Color(51, 51, 51));
        btnPesquisar.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("PESQUISAR");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPesquisar);
        btnPesquisar.setBounds(630, 280, 200, 40);

        setSize(new java.awt.Dimension(861, 575));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtulizarActionPerformed
        try {
            //1 - Conectar ao Banco de Dados
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");

            //2 - Buscar todos os usuários (SELECT)
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario");
            ResultSet resultado = st.executeQuery();
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtulizarActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        //Pegar o cargo  selecionado pelo usuário.
        String cargo;
        cargo = cmbCargo.getSelectedItem().toString();
        if (cargo.equalsIgnoreCase("Ver Todos")) {
            prencherTabela();
            return;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WhERE cargo LIKE ? ");
            st.setString(1, cargo);
            ResultSet resultado = st.executeQuery();
            
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }
            //4 Desconectar do banco d dados
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void pesquisar() {
        String nome;
        nome = txtPesquisa.getText();
        prencherTabela();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WhERE nome LIKE ?");
            st.setString(1, nome);
            ResultSet resultado = st.executeQuery();
            
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuarios.getModel();
            tblModelo.setRowCount(0);
            
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("usuario"),
                    resultado.getString("senha"),
                    resultado.getString("nome"),
                    resultado.getString("cargo")
                };
                tblModelo.addRow(dados);
            }
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisar();
        txtPesquisa.setText("");
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtulizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JTable tblUsuarios;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
