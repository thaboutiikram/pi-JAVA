package Panier;

  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/


import DataBase.Connexion;
import static DataBase.Connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author ikram
 */

public class CrudPanier{

    private Connection cnx;
    private PreparedStatement pst;
    private ResultSet rst;
    public void ajouterPanier(Panier p) {
        try {
            String query = "INSERT INTO panier_produit (nom,prix)" + "VALUES ('"+p.getNom()+"','"+p.getPrix()+"')";
           cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);

            pst.executeUpdate(query);
            System.out.println("Produit ajoutée");
            System.out.println(p.getNom());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    
    }
 

    public void supprimerPanier(Panier p) {
try {
            String query = "DELETE FROM panier_produit where id=?";
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);

            pst.executeUpdate(query);      
            pst.setInt(1, p.getId());
            pst.executeUpdate();
            System.out.println("Produit supprimée from panier");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public void updatePanier(Panier p) {
       try {
            String query = "UPDATE panier_produit SET nom=? WHERE id=?";
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);
            pst.setString(1,p.getNom());
            pst.setInt(2,p.getId());
            pst.executeUpdate();
            System.out.println("Panier modifiée");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

  
    public List<Panier> displayPanier() {
           List<Panier> PanierList = new ArrayList<>();
        try {
            String query = "SELECT * FROM panier_produit";
             cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);
            ResultSet rs =  pst.executeQuery(query);
            while(rs.next()){
                Panier p = new Panier();
                p.setId(rs.getInt("id"));
                p.setNom(rs.getString(2));
                p.setPrix(rs.getString("prix"));
                PanierList.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return PanierList;
    }
} 

  
