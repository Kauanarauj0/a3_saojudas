package interfaces;

import dao.UsuarioDao;
import javax.swing.JOptionPane;

public class TelaApresentacao extends javax.swing.JFrame {

    public TelaApresentacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnVisitante = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnLogin.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(110, 84, 84));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 130, 50));

        btnVisitante.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnVisitante.setForeground(new java.awt.Color(110, 84, 84));
        btnVisitante.setText("Visitante");
        btnVisitante.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVisitante.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisitanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 180, 50));

        btnCadastro.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 36)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(110, 84, 84));
        btnCadastro.setText("Cadastre-se");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, 230, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/FotoInicio.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnVisitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisitanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisitanteActionPerformed

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro tc = new TelaCadastro();
        tc.setVisible(true);
                
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaApresentacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnVisitante;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}