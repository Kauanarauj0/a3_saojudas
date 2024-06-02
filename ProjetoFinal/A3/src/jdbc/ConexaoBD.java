package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoBD {
    private static String USERNAME = "root";
    private static String PASSWORD = "1234";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/Projeto";
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        catch(ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}