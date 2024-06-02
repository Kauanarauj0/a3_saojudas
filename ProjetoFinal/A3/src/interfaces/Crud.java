package interfaces;

import net.proteanit.sql.DbUtils;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Crud {
    private JPanel mainFrame;
    private JLabel titulo;
    private JLabel Nome;
    private JLabel Celular;
    private JLabel Email;
    private JTable tabuser;
    private JTextField txtNome;
    private JTextField txtCelular;
    private JTextField txtEmail;
    private JTextField txtProcura;
    private JButton salvar;
    private JButton atualizar;
    private JButton excluir;
    private JButton procurarButton;
    private JPasswordField psswd;
    private JScrollPane users;

    public Crud() {
        conexao();
        table_load();
        ImageIcon icon = new ImageIcon("simbolo-de-reciclagem.png");

        salvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome, celular, email, senha;
                nome = txtNome.getText();
                celular = txtCelular.getText();
                email = txtEmail.getText();
                senha = new String(psswd.getPassword());

                try {
                    pst = con.prepareStatement("insert into usuario(nome,celular,email,senha) values(?,?,?,?)"); //Salva no DB
                    pst.setString(1, nome);
                    pst.setString(2, celular);
                    pst.setString(3, email);
                    pst.setString(4, senha);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
                    table_load();
                    txtNome.setText(""); // Limpa campos após gravar
                    txtCelular.setText("");
                    txtEmail.setText("");
                    psswd.setText("");
                }
                catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        procurarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String procura = txtProcura.getText();
                    pst = con.prepareStatement("select nome, celular, email from usuario where nome LIKE ? OR celular LIKE ? OR email LIKE ?");
                    pst.setString(1, "%" + procura + "%"); //Procura o conteudo do textfield procura nas colunas
                    pst.setString(2, "%" + procura + "%"); // nome, celular e email do banco de dados
                    pst.setString(3, "%" + procura + "%");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()==true) {
                        String nome = rs.getString(1);
                        String celular = rs.getString(2);
                        String email = rs.getString(3);

                        txtNome.setText(nome);
                        txtCelular.setText(celular);
                        txtEmail.setText(email);
                    }
                    else {
                        txtNome.setText("");
                        txtCelular.setText("");
                        txtEmail.setText("");
                        JOptionPane.showMessageDialog(null,"Não foi encontrado nenhum registro!");
                    }
                }
                catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
        atualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        String senha;
                        senha = new String(psswd.getPassword());

                        try {
                            pst = con.prepareStatement("update usuario set nome = ?, celular = ?, email = ?, senha = ? where email = ?");
                            pst.setString(1, txtNome.getText());
                            pst.setString(2, txtCelular.getText());
                            pst.setString(3, txtEmail.getText());
                            pst.setString(4, senha);
                            pst.setString(5, txtEmail.getText());
                            pst.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
                            table_load();
                            txtNome.setText("");
                            txtCelular.setText("");
                            txtEmail.setText("");
                            psswd.setText("");
                        }
                        catch (SQLException ex) {
                            ex.printStackTrace();
                        }
                    }
                });
            }
        });
        excluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String email;

                email = txtEmail.getText();

                try {
                    pst = con.prepareStatement("delete from usuario where email = ?");
                    pst.setString(1, email);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
                    table_load();
                    txtNome.setText("");
                    txtCelular.setText("");
                    txtEmail.setText("");

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }

            }
        });
    }

    Connection con;
    PreparedStatement pst;

    public void conexao () {

        try { //Trocar pelos dados do banco de dados local
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Kauanarauj0@");
            System.out.println("Conectado ao BD com sucesso!");
        }
        catch (ClassNotFoundException  ex)   {
            ex.printStackTrace();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    void table_load(){
        try {
            pst = con.prepareStatement("select nome, celular, email from usuario");
            ResultSet rs = pst.executeQuery();
            tabuser.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Crud");
        frame.setContentPane(new Crud().mainFrame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
}
