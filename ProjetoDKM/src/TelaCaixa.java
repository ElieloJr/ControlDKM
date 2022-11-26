
import dados.sistemadao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaCaixa extends javax.swing.JFrame {
    String codProd, nome, quantidadeDisponivel, quantidadeDesejada, quantidadeFinal, valor;
    DefaultTableModel tblModelo;

    public TelaCaixa() {
        initComponents();
        tblModelo = (DefaultTableModel) tblProdutosNoCarrinho.getModel();
        tblModelo.setRowCount(0);
        
        btnAdicionar.setEnabled(false);
        btnCancelarCompra.setEnabled(false);
        btnFinalizarCompra.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblProdutosNoCarrinho = new javax.swing.JTable();
        btnAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        valorDaCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelarCompra = new javax.swing.JButton();
        btnFinalizarCompra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblAbertoFechado = new javax.swing.JLabel();
        btnMudaStatus = new javax.swing.JButton();

        setTitle("Caixa");
        getContentPane().setLayout(null);

        tblProdutosNoCarrinho.setBackground(new java.awt.Color(255, 255, 255));
        tblProdutosNoCarrinho.setBorder(new javax.swing.border.MatteBorder(null));
        tblProdutosNoCarrinho.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tblProdutosNoCarrinho.setForeground(new java.awt.Color(0, 0, 0));
        tblProdutosNoCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codígo", "Nome", "Quantidade", "Valor Unidade"
            }
        ));
        jScrollPane1.setViewportView(tblProdutosNoCarrinho);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 450, 390);

        btnAdicionar.setBackground(new java.awt.Color(51, 51, 51));
        btnAdicionar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdicionar);
        btnAdicionar.setBounds(50, 410, 370, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("R$");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 180, 20, 60);

        valorDaCompra.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        valorDaCompra.setForeground(new java.awt.Color(0, 0, 0));
        valorDaCompra.setText("0");
        getContentPane().add(valorDaCompra);
        valorDaCompra.setBounds(510, 180, 160, 60);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STATUS DO CAIXA");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(510, 20, 190, 20);

        btnCancelarCompra.setBackground(new java.awt.Color(51, 51, 51));
        btnCancelarCompra.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCancelarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarCompra.setText("CANCELAR COMPRA");
        btnCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelarCompra);
        btnCancelarCompra.setBounds(470, 290, 260, 50);

        btnFinalizarCompra.setBackground(new java.awt.Color(51, 51, 51));
        btnFinalizarCompra.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnFinalizarCompra.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizarCompra.setText("FINALIZAR COMPRA");
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        getContentPane().add(btnFinalizarCompra);
        btnFinalizarCompra.setBounds(470, 350, 260, 50);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("VALOR TOTAL");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 160, 130, 20);

        lblAbertoFechado.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        lblAbertoFechado.setForeground(new java.awt.Color(0, 0, 0));
        lblAbertoFechado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAbertoFechado.setText("FECHADO");
        lblAbertoFechado.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblAbertoFechado);
        lblAbertoFechado.setBounds(510, 30, 190, 50);

        btnMudaStatus.setText("ABRIR CAIXA");
        btnMudaStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMudaStatusActionPerformed(evt);
            }
        });
        getContentPane().add(btnMudaStatus);
        btnMudaStatus.setBounds(510, 80, 190, 25);

        setSize(new java.awt.Dimension(765, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        codProd = JOptionPane.showInputDialog(null, "Digite o código do produto");
        if (codProd == null) { return; }

        if (!codProd.isEmpty()) {
            try {
                sistemadao dao;
                dao = new sistemadao();
                ResultSet resultado = dao.adicionarCaixa(codProd);
                

                if (resultado.next()) {
                    quantidadeDesejada = JOptionPane.showInputDialog(null, "Digite quantidade do produto");
                    nome = resultado.getString("nome");
                    quantidadeDisponivel = resultado.getString("quantidade");
                    valor = resultado.getString("valor");
                } else {
                    JOptionPane.showMessageDialog(null, "Produto não encontrado");
                    return;
                }
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Driver não está na library");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Você errou nos dados da conexão com o banco de dados");
            }
        }
        
        if (quantidadeDesejada == null) { return; }

        if (quantDisponivel()) {
            try {
                sistemadao dao;
                dao = new sistemadao();
                dao.tabelaCaixa(quantidadeFinal, codProd);
                
                Object dados[] = { codProd, nome, quantidadeDesejada, valor };
                tblModelo.addRow(dados);
                
                Integer valorAtual = Integer.parseInt(valorDaCompra.getText());
                Integer valorNovo = valorAtual + (Integer.parseInt(quantidadeDesejada) * Integer.parseInt(valor));
                valorDaCompra.setText(Integer.toString(valorNovo));
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Mensagem de erro: " + ex.getMessage());
            } catch (SQLException ex) {
                int erro = ex.getErrorCode();
                if (erro == 1062) {
                    JOptionPane.showMessageDialog(null, "Não é possível levar");
                } else {
                    JOptionPane.showMessageDialog(null, "Entre em contato com o "
                            + "administrador do sistema e informe o erro: " 
                            + ex.getMessage());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade indisponível");        
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraActionPerformed
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Cancelar compra?", "Confirmação", 0);
        if (resposta == 0) {
            tblModelo.setRowCount(0);
            valorDaCompra.setText("0");
        }
    }//GEN-LAST:event_btnCancelarCompraActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        if (!valorDaCompra.getText().equals("0")) {
            TelaConfirmacaoPagamento tela;
            tela = new TelaConfirmacaoPagamento(valorDaCompra.getText());
            tela.setVisible(true);
        
            tblModelo.setRowCount(0);
            valorDaCompra.setText("0");
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível finalizar a compra sem ter produtos.");
        }
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnMudaStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMudaStatusActionPerformed
        if (valorDaCompra.getText().equals("0")) {
            if (lblAbertoFechado.getText().equals("ABERTO")) {
                lblAbertoFechado.setText("FECHADO");
                btnMudaStatus.setText("ABRIR CAIXA");
                btnAdicionar.setEnabled(false);
                btnCancelarCompra.setEnabled(false);
                btnFinalizarCompra.setEnabled(false);
            } else {
                lblAbertoFechado.setText("ABERTO");
                btnMudaStatus.setText("FECHAR CAIXA");
                btnAdicionar.setEnabled(true);
                btnCancelarCompra.setEnabled(true);
                btnFinalizarCompra.setEnabled(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Conclua a venda antes de fechar o caixa.");
        }
        
    }//GEN-LAST:event_btnMudaStatusActionPerformed

    private Boolean quantDisponivel() {
        if (Integer.parseInt(quantidadeDisponivel) >= Integer.parseInt(quantidadeDesejada)) {
            quantidadeFinal = Integer.toString(Integer.parseInt(quantidadeDisponivel) - Integer.parseInt(quantidadeDesejada));
            return true;
        } else { return false; }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnCancelarCompra;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnMudaStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAbertoFechado;
    private javax.swing.JTable tblProdutosNoCarrinho;
    private javax.swing.JLabel valorDaCompra;
    // End of variables declaration//GEN-END:variables
}
