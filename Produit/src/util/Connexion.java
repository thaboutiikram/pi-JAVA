/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ikram
 */
public class Connexion {
   
   private Connection connexion;
   public Connexion () throws SQLException
   {
      try {
 private  String url="jbdc:mysql://localhost/coachinii";
  private String login="root";
  private String pwd="";
  Class.forName( "com.mysql.jdbc.Driver");
  connexion=DriverManager.getConnection(url, login, pwd);
              System.out.println("connexion etablie");
Statement st= connexion.createStatement()
}
catch(ClassNotFoundException ex){

}
}

   
   
    
    private Connection cnx;
    

    public Connexion() {
        try {
            cnx=DriverManager.getConnection(url, login, pwd);
                    } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}
