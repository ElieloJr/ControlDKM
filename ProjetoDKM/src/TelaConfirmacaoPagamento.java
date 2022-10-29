import javax.swing.JOptionPane;

public class TelaConfirmacaoPagamento extends javax.swing.JFrame {
    public TelaConfirmacaoPagamento(String valor) {
        initComponents();
        valorDaCompra.setText(valor);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valorDaCompra = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPix = new javax.swing.JButton();
        btnCartaoDebito = new javax.swing.JButton();
        btnCartaoCredito = new javax.swing.JButton();
        btnValeAlimentacao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("R$");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 160, 30, 90);

        valorDaCompra.setFont(new java.awt.Font("Segoe UI Black", 0, 60)); // NOI18N
        valorDaCompra.setForeground(new java.awt.Color(0, 0, 0));
        valorDaCompra.setText("0");
        getContentPane().add(valorDaCompra);
        valorDaCompra.setBounds(80, 160, 180, 90);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("VALOR TOTAL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 140, 170, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CONFIRMAR FORMA DE PAGAMENTO");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 10, 630, 70);

        btnPix.setBackground(new java.awt.Color(51, 51, 51));
        btnPix.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnPix.setForeground(new java.awt.Color(255, 255, 255));
        btnPix.setText("PIX");
        btnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPixActionPerformed(evt);
            }
        });
        getContentPane().add(btnPix);
        btnPix.setBounds(360, 300, 240, 50);

        btnCartaoDebito.setBackground(new java.awt.Color(51, 51, 51));
        btnCartaoDebito.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCartaoDebito.setForeground(new java.awt.Color(255, 255, 255));
        btnCartaoDebito.setText("CARTÃO DÉBITO");
        btnCartaoDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoDebito);
        btnCartaoDebito.setBounds(360, 120, 240, 50);

        btnCartaoCredito.setBackground(new java.awt.Color(51, 51, 51));
        btnCartaoCredito.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnCartaoCredito.setForeground(new java.awt.Color(255, 255, 255));
        btnCartaoCredito.setText("CARTÃO CRÉDITO");
        btnCartaoCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCartaoCreditoActionPerformed(evt);
            }
        });
        getContentPane().add(btnCartaoCredito);
        btnCartaoCredito.setBounds(360, 180, 240, 50);

        btnValeAlimentacao.setBackground(new java.awt.Color(51, 51, 51));
        btnValeAlimentacao.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnValeAlimentacao.setForeground(new java.awt.Color(255, 255, 255));
        btnValeAlimentacao.setText("VALE ALIMENTAÇÃO");
        btnValeAlimentacao.setToolTipText("");
        btnValeAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValeAlimentacaoActionPerformed(evt);
            }
        });
        getContentPane().add(btnValeAlimentacao);
        btnValeAlimentacao.setBounds(360, 240, 240, 50);

        setSize(new java.awt.Dimension(644, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPixActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Pagamento realizado?", "Confirmação", 0);
        if (resposta == 0) { dispose(); }
    }//GEN-LAST:event_btnPixActionPerformed

    private void btnCartaoDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoDebitoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Pagamento realizado?", "Confirmação", 0);
        if (resposta == 0) { dispose(); }
    }//GEN-LAST:event_btnCartaoDebitoActionPerformed

    private void btnCartaoCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCartaoCreditoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Pagamento realizado?", "Confirmação", 0);
        if (resposta == 0) { dispose(); }
    }//GEN-LAST:event_btnCartaoCreditoActionPerformed

    private void btnValeAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValeAlimentacaoActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Pagamento realizado?", "Confirmação", 0);
        if (resposta == 0) { dispose(); }
    }//GEN-LAST:event_btnValeAlimentacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCartaoCredito;
    private javax.swing.JButton btnCartaoDebito;
    private javax.swing.JButton btnPix;
    private javax.swing.JButton btnValeAlimentacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel valorDaCompra;
    // End of variables declaration//GEN-END:variables
}
