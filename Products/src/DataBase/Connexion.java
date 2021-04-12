package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connexion {
    private String url="jdbc:mysql://localhost/coachinii";
    private String login="root";
    private String pwd="";
    private Connection cnx;
    public Connexion(){
  
            try {
                cnx=DriverManager.getConnection(url, login, pwd);
                  System.out.println("Connexion etablie");
       
            } catch (SQLException ex) {
                Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
            }
          
    }

    public Statement CreateStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
            
    
}
