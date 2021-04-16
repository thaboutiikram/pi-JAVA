package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {

    private static String url = "jdbc:mysql://localhost/coachinii";
    private static String login = "root";
    private static String pwd = "";

    public static Connection Connexion() {
        Connection cnx = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, pwd);
         //   return cnx;

        } catch (SQLException ex) {
            ex.printStackTrace();
             } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("connection etablies ");
        return cnx;
    }
    public static void main(String[] args) {
        Connexion();
    }
}
