
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaProdutosCadastrados extends javax.swing.JFrame {
    public TelaProdutosCadastrados() {
        initComponents();
        prencherTabela();
    }

    private void prencherTabela() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");

            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produto");
            ResultSet resultado = st.executeQuery();
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblProdutosSistema.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("codProd"),
                    resultado.getString("nome"),
                    resultado.getString("quantidade"),
                    resultado.getString("valor")
                };
                tblModelo.addRow(dados);
            }
            conectado.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutosSistema = new javax.swing.JTable();
        btnAtualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        lblControledeEstoque = new javax.swing.JLabel();

        setTitle("Produtos Cadastrados");
        getContentPane().setLayout(null);

        tblProdutosSistema.setBackground(new java.awt.Color(255, 255, 255));
        tblProdutosSistema.setBorder(new javax.swing.border.MatteBorder(null));
        tblProdutosSistema.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblProdutosSistema.setForeground(new java.awt.Color(0, 0, 0));
        tblProdutosSistema.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codígo", "Nome do Produto", " Qualidade do Produto", "Valor da Unidade"
            }
        ));
        jScrollPane1.setViewportView(tblProdutosSistema);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 710, 310);

        btnAtualizar.setBackground(new java.awt.Color(51, 51, 51));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtualizar);
        btnAtualizar.setBounds(20, 390, 120, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("CÓDIGO DO PRODUTO:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 390, 180, 30);

        txtPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisaActionPerformed(evt);
            }
        });
        getContentPane().add(txtPesquisa);
        txtPesquisa.setBounds(410, 390, 190, 30);

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
        btnPesquisar.setBounds(610, 390, 120, 30);

        lblControledeEstoque.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblControledeEstoque.setForeground(new java.awt.Color(0, 0, 0));
        lblControledeEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControledeEstoque.setText("PRODUTOS CADASTRADOS");
        getContentPane().add(lblControledeEstoque);
        lblControledeEstoque.setBounds(0, 10, 740, 50);

        setSize(new java.awt.Dimension(758, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisaActionPerformed

    }//GEN-LAST:event_txtPesquisaActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        String nome;
        nome = txtPesquisa.getText();
        prencherTabela();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produto WhERE codProd LIKE ?");
            st.setString(1, nome);
            ResultSet resultado = st.executeQuery();
            
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblProdutosSistema.getModel();
            tblModelo.setRowCount(0);
            
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("codProd"),
                    resultado.getString("nome"),
                    resultado.getString("quantidade"),
                    resultado.getString("valor")
                };
                tblModelo.addRow(dados);
            }
            conectado.close();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        txtPesquisa.setText("");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");

            PreparedStatement st = conectado.prepareStatement("SELECT * FROM produto");
            ResultSet resultado = st.executeQuery();
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblProdutosSistema.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
                    resultado.getString("codProd"),
                    resultado.getString("nome"),
                    resultado.getString("quantidade"),
                    resultado.getString("valor")
                };
                tblModelo.addRow(dados);
            }
            conectado.close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TelaTabelaUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblControledeEstoque;
    private javax.swing.JTable tblProdutosSistema;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}
