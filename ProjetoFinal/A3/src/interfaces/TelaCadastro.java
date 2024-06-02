package interfaces;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import dao.UsuarioDao;
import javax.swing.JOptionPane;
import model.Usuario;

public class TelaCadastro extends javax.swing.JFrame {
    private void txtNomeFocusGained(FocusEvent e) {
        if (txtNome.getText().equals("Digite seu nome")) {
            txtNome.setText("");
        }
    }

    private void txtNomeFocusLost(FocusEvent e) {
        if (txtNome.getText().isEmpty()) {
            txtNome.setText("Digite seu nome");
        }
    }

    private void txtCelularFocusGained(FocusEvent e) {
        if (txtCelular.getText().equals("Digite seu celular")) {
            txtCelular.setText("");
        }
    }

    private void txtCelularFocusLost(FocusEvent e) {
        if (txtCelular.getText().isEmpty()) {
            txtCelular.setText("Digite seu celular");
        }
    }

    private void txtEmailFocusGained(FocusEvent e) {
        if (txtEmail.getText().equals("Digite seu e-mail")) {
            txtEmail.setText("");
        }
    }

    private void txtEmailFocusLost(FocusEvent e) {
        if (txtEmail.getText().isEmpty()) {
            txtEmail.setText("Digite seu e-mail");
        }
    }

    public TelaCadastro() {
        initComponents();
        Utilitario icone = new Utilitario();
        icone.defineIcone(); //Metodo da minha classe utilitario
        setIconImage(icone.getIconImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    // Generated using JFormDesigner Evaluation license - Kauan Araujo
    private void initComponents() {
        btnCancelar = new JButton();
        lblSenhaCadastro = new JLabel();
        lblConfirmeCadastro = new JLabel();
        lblEmailCadastro = new JLabel();
        lblCelularCadastro = new JLabel();
        lblNomeCadastro = new JLabel();
        btnLimpar = new JButton();
        btnCadastrar = new JButton();
        txtEmail = new JTextField();
        txtCelular = new JTextField();
        txtConfirme = new JPasswordField();
        txtSenha = new JPasswordField();
        txtNome = new JTextField();
        jLabel1 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- btnCancelar ----
        btnCancelar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnCancelar.setForeground(new Color(0x795e5e));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnCancelar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(e -> btnCancelarActionPerformed(e));
        contentPane.add(btnCancelar);
        btnCancelar.setBounds(570, 650, 150, 60);

        //---- lblSenhaCadastro ----
        lblSenhaCadastro.setBackground(new Color(0x006600));
        lblSenhaCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        lblSenhaCadastro.setForeground(new Color(0x6e5656));
        lblSenhaCadastro.setText("Senha:");
        contentPane.add(lblSenhaCadastro);
        lblSenhaCadastro.setBounds(360, 420, 120, 60);

        //---- lblConfirmeCadastro ----
        lblConfirmeCadastro.setBackground(new Color(0x006600));
        lblConfirmeCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        lblConfirmeCadastro.setForeground(new Color(0x6e5656));
        lblConfirmeCadastro.setText("Confirme:");
        contentPane.add(lblConfirmeCadastro);
        lblConfirmeCadastro.setBounds(310, 500, 160, 40);

        //---- lblEmailCadastro ----
        lblEmailCadastro.setBackground(new Color(0x006600));
        lblEmailCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        lblEmailCadastro.setForeground(new Color(0x6e5656));
        lblEmailCadastro.setText("Email:");
        contentPane.add(lblEmailCadastro);
        lblEmailCadastro.setBounds(360, 350, 120, 60);

        //---- lblCelularCadastro ----
        lblCelularCadastro.setBackground(new Color(0x006600));
        lblCelularCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        lblCelularCadastro.setForeground(new Color(0x6e5656));
        lblCelularCadastro.setText("Celular:");
        contentPane.add(lblCelularCadastro);
        lblCelularCadastro.setBounds(340, 280, 140, 50);

        //---- lblNomeCadastro ----
        lblNomeCadastro.setBackground(new Color(0x006600));
        lblNomeCadastro.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        lblNomeCadastro.setForeground(new Color(0x6e5656));
        lblNomeCadastro.setText("Nome:");
        contentPane.add(lblNomeCadastro);
        lblNomeCadastro.setBounds(360, 200, 120, 60);

        //---- btnLimpar ----
        btnLimpar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnLimpar.setForeground(new Color(0x695353));
        btnLimpar.setText("Limpar");
        btnLimpar.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnLimpar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnLimpar.addActionListener(e -> btnLimparActionPerformed(e));
        contentPane.add(btnLimpar);
        btnLimpar.setBounds(490, 580, 140, 60);

        //---- btnCadastrar ----
        btnCadastrar.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 36));
        btnCadastrar.setForeground(new Color(0x795e5e));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
        btnCadastrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(e -> btnCadastrarActionPerformed(e));
        contentPane.add(btnCadastrar);
        btnCadastrar.setBounds(640, 580, 170, 60);

        //---- txtEmail ----
        txtEmail.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        txtEmail.setForeground(new Color(0xcccccc));
        txtEmail.setText("Digite seu e-mail");
        txtEmail.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtEmailFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                txtEmailFocusLost(e);
            }
        });
        contentPane.add(txtEmail);
        txtEmail.setBounds(490, 360, 320, 40);

        //---- txtCelular ----
        txtCelular.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        txtCelular.setForeground(new Color(0xcccccc));
        txtCelular.setText("Digite seu celular");
        txtCelular.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtCelularFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                txtCelularFocusLost(e);
            }
        });
        contentPane.add(txtCelular);
        txtCelular.setBounds(490, 280, 320, 40);

        //---- txtConfirme ----
        txtConfirme.setFont(new Font("Gill Sans MT Condensed", Font.PLAIN, 36));
        contentPane.add(txtConfirme);
        txtConfirme.setBounds(490, 500, 320, 40);

        //---- txtSenha ----
        txtSenha.setFont(new Font("Gill Sans MT Condensed", Font.PLAIN, 36));
        txtSenha.addActionListener(e -> txtSenhaActionPerformed(e));
        contentPane.add(txtSenha);
        txtSenha.setBounds(490, 430, 320, 40);

        //---- txtNome ----
        txtNome.setFont(new Font("Berlin Sans FB", Font.PLAIN, 18));
        txtNome.setText("Digite seu nome");
        txtNome.setHorizontalAlignment(SwingConstants.LEFT);
        txtNome.setForeground(new Color(0xcccccc));
        txtNome.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                txtNomeFocusGained(e);
            }
            @Override
            public void focusLost(FocusEvent e) {
                txtNomeFocusLost(e);
            }
        });
        contentPane.add(txtNome);
        txtNome.setBounds(490, 210, 320, 40);

        //---- jLabel1 ----
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/interfaces/FotoCadastro.png")));
        contentPane.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaActionPerformed
        
    }//GEN-LAST:event_txtSenhaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        Usuario usuario = new Usuario();
        
        String nome, celular, email, senha, confirme;
        nome = (txtNome.getText());
        celular = (txtCelular.getText());
        email = (txtEmail.getText());
        senha = new String(txtSenha.getPassword());
        confirme = new String (txtConfirme.getPassword());
        if (nome.trim().equals("") || celular.trim().equals("")
        || email.trim().equals("") || senha.trim().equals("") || confirme.trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos.");
        }
        else if (!senha.equals(confirme)){
        JOptionPane.showMessageDialog(rootPane, "A Senha não confere.");
    }
        else {
            usuario.setNome(txtNome.getText());
            usuario.setCelular(txtCelular.getText());
            usuario.setEmail(txtEmail.getText());
            usuario.setSenha(senha);
            UsuarioDao dao = new UsuarioDao();
            dao.adicionaUsuario(usuario);
            JOptionPane.showMessageDialog(rootPane, "Usuario cadastrado com sucesso!");

        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
        this.dispose();
    }  
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja sair do cadastro?");
        if (resposta == 0) {
        TelaLogin telalogin = new TelaLogin();
        telalogin.setVisible(true);
        this.dispose();
        }
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtNome.setText("");
        txtCelular.setText("");
        txtEmail.setText("");
        txtSenha.setText("");
        txtConfirme.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Kauan Araujo
    private JButton btnCancelar;
    private JLabel lblSenhaCadastro;
    private JLabel lblConfirmeCadastro;
    private JLabel lblEmailCadastro;
    private JLabel lblCelularCadastro;
    private JLabel lblNomeCadastro;
    private JButton btnLimpar;
    private JButton btnCadastrar;
    private JTextField txtEmail;
    private JTextField txtCelular;
    private JPasswordField txtConfirme;
    private JPasswordField txtSenha;
    private JTextField txtNome;
    private JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
