import dados.sistemadao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaGerente extends javax.swing.JFrame {
    public TelaGerente(String nome, String cargo) {
        initComponents();
        
        try {
            sistemadao dao;
            dao = new sistemadao();
            ResultSet resultado = dao.telaGerente();
           
            DefaultTableModel tblModelo;
            tblModelo = (DefaultTableModel) tblUsuario.getModel();
            tblModelo.setRowCount(0);
            while (resultado.next()) {
                Object dados[] = {
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

        lblSaudacao1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuario = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCaixa = new javax.swing.JMenu();
        itmCaixa = new javax.swing.JMenuItem();
        mnuEstoque = new javax.swing.JMenu();
        itmCadastrarProduto = new javax.swing.JMenuItem();
        itmAdicionarRemessa = new javax.swing.JMenuItem();
        itmEditarProduto = new javax.swing.JMenuItem();
        itmDeletarProduto = new javax.swing.JMenuItem();
        itmProdutosCadastrados = new javax.swing.JMenuItem();
        mnuAdmin = new javax.swing.JMenu();
        itmCadatrarUsuario = new javax.swing.JMenuItem();
        itmExluirUsuario = new javax.swing.JMenuItem();
        itmEditarUsuario = new javax.swing.JMenuItem();
        itmListaUsuarios = new javax.swing.JMenuItem();

        setTitle("Menu");
        getContentPane().setLayout(null);

        lblSaudacao1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblSaudacao1.setForeground(new java.awt.Color(0, 0, 0));
        lblSaudacao1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaudacao1.setText("RELAÇÃO DE FUNCIONÁRIOS");
        getContentPane().add(lblSaudacao1);
        lblSaudacao1.setBounds(0, 0, 720, 60);

        tblUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Funcionário", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(tblUsuario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(120, 60, 480, 390);

        mnuCaixa.setText("Caixa");

        itmCaixa.setText("Caixa");
        itmCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCaixaActionPerformed(evt);
            }
        });
        mnuCaixa.add(itmCaixa);

        jMenuBar1.add(mnuCaixa);

        mnuEstoque.setText("Estoque");

        itmCadastrarProduto.setText("Cadastrar Produto");
        itmCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadastrarProdutoActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmCadastrarProduto);

        itmAdicionarRemessa.setText("Adicionar Nova Remessa");
        itmAdicionarRemessa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAdicionarRemessaActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmAdicionarRemessa);

        itmEditarProduto.setText("Editar Produto");
        itmEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarProdutoActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmEditarProduto);

        itmDeletarProduto.setText("Deletar Produto");
        itmDeletarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmDeletarProdutoActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmDeletarProduto);

        itmProdutosCadastrados.setText("Produtos Cadastrados");
        itmProdutosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmProdutosCadastradosActionPerformed(evt);
            }
        });
        mnuEstoque.add(itmProdutosCadastrados);

        jMenuBar1.add(mnuEstoque);

        mnuAdmin.setText("Admin");

        itmCadatrarUsuario.setText("Cadastrar Usuário");
        itmCadatrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmCadatrarUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmCadatrarUsuario);

        itmExluirUsuario.setText("Excluir Usuário");
        itmExluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmExluirUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmExluirUsuario);

        itmEditarUsuario.setText("Editar Usuário");
        itmEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmEditarUsuarioActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmEditarUsuario);

        itmListaUsuarios.setText("Usuários do Sistema ");
        itmListaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmListaUsuariosActionPerformed(evt);
            }
        });
        mnuAdmin.add(itmListaUsuarios);

        jMenuBar1.add(mnuAdmin);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(729, 532));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmCadatrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadatrarUsuarioActionPerformed
        TelaAdmin tela;
        tela = new TelaAdmin();
        tela.setVisible(true);
    }//GEN-LAST:event_itmCadatrarUsuarioActionPerformed

    private void itmExluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmExluirUsuarioActionPerformed
        abrirTelaUsuario("Excluir");
    }//GEN-LAST:event_itmExluirUsuarioActionPerformed

    private void itmListaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmListaUsuariosActionPerformed
        TelaTabelaUsuarios tela;
        tela = new TelaTabelaUsuarios();
        tela.setVisible(true);
    }//GEN-LAST:event_itmListaUsuariosActionPerformed

    private void itmCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCadastrarProdutoActionPerformed
        TelaCadastroProdutos tela;
        tela = new TelaCadastroProdutos();
        tela.setVisible(true);
    }//GEN-LAST:event_itmCadastrarProdutoActionPerformed

    private void itmEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarUsuarioActionPerformed
         abrirTelaUsuario("Alterar");
    }//GEN-LAST:event_itmEditarUsuarioActionPerformed
  private void abrirTelaUsuario(String operacao){
        String user;
        user = JOptionPane.showInputDialog(null, "Digite o Usuário");
        
        if (user == null) { return; }

        try {
            //2 - Conectar no banco de dados sistemabd;
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
            PreparedStatement st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
            st.setString(1, user);
            ResultSet resultado = st.executeQuery();
            //4 - Verificar se o usuário foi encontrado na tabela usuario do banco de dados.
            if (resultado.next()) {
                String senha, nome, cargo, usuario;

                nome = resultado.getString("nome");
                senha = resultado.getString("senha");
                usuario = resultado.getString("usuario");
                cargo = resultado.getString("cargo");

                TelaAdmin tela;
                tela = new TelaAdmin (usuario, senha, nome, cargo, operacao);
                tela.setVisible(true);
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
    private void itmCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmCaixaActionPerformed
        TelaCaixa tela;
        tela = new TelaCaixa();
        tela.setVisible(true);
    }//GEN-LAST:event_itmCaixaActionPerformed

    private void itmAdicionarRemessaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAdicionarRemessaActionPerformed
        TelaAdicionarRemessa tela;
        tela = new TelaAdicionarRemessa();
        tela.setVisible(true);
    }//GEN-LAST:event_itmAdicionarRemessaActionPerformed

    private void itmEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmEditarProdutoActionPerformed
        TelaEditarProduto tela;
        tela = new TelaEditarProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_itmEditarProdutoActionPerformed

    private void itmDeletarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmDeletarProdutoActionPerformed
        TelaExcluirProduto tela;
        tela = new TelaExcluirProduto();
        tela.setVisible(true);
    }//GEN-LAST:event_itmDeletarProdutoActionPerformed

    private void itmProdutosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmProdutosCadastradosActionPerformed
        TelaProdutosCadastrados tela;
        tela = new TelaProdutosCadastrados();
        tela.setVisible(true);
    }//GEN-LAST:event_itmProdutosCadastradosActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAdicionarRemessa;
    private javax.swing.JMenuItem itmCadastrarProduto;
    private javax.swing.JMenuItem itmCadatrarUsuario;
    private javax.swing.JMenuItem itmCaixa;
    private javax.swing.JMenuItem itmDeletarProduto;
    private javax.swing.JMenuItem itmEditarProduto;
    private javax.swing.JMenuItem itmEditarUsuario;
    private javax.swing.JMenuItem itmExluirUsuario;
    private javax.swing.JMenuItem itmListaUsuarios;
    private javax.swing.JMenuItem itmProdutosCadastrados;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSaudacao1;
    private javax.swing.JMenu mnuAdmin;
    private javax.swing.JMenu mnuCaixa;
    private javax.swing.JMenu mnuEstoque;
    private javax.swing.JTable tblUsuario;
    // End of variables declaration//GEN-END:variables
}
