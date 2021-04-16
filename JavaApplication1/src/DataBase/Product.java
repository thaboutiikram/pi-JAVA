/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ikram
 */
public class Product {

    private Connection cnx;
    private PreparedStatement pst;
    private ResultSet rst;

    public void AfficherProduit() {
        try {
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement("SELECT * FROM produit");
            rst = (ResultSet) pst.executeQuery();
            while (rst.next()) {
                System.out.print(rst.getInt("id") + "\t");
                System.out.print(rst.getInt("prix") + "\t");
                System.out.print(rst.getString("labelle") + "\t");
                System.out.print(rst.getInt("quantite") + "\t");
                System.out.print(rst.getString("image") + "\t");
                System.out.print(rst.getString("type") + "\t");
                System.out.println("");
            }
            // peace 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    

    public void AjouterProduit(int prix, String labelle,  int quantite, String image, String type) {
        
        try {
            String query = "INSERT INTO produit (prix ,labelle, quantite, image, type) value (?,?,?,?,?)";
         
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);

            pst.setInt(1, prix);
            pst.setString(2, labelle);
            pst.setInt(3, quantite);
            pst.setString(4, image);
            pst.setString(5, type);


           System.out.println(pst);
		pst.executeUpdate();
	} catch (Exception e) {
		System.out.println(e);
	}
}

    public void SupprimerByID(int id) {
        try {
            String query = "DELETE FROM PRODUIT WHERE id=" + id;
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);
            int i = pst.executeUpdate();
            if (i == 1) {
                System.out.println("Produit bien supprimé");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

    public void ModifierProduit(int id, String n_labelle, int n_prix, int n_quantité, String n_type) {

        try {
            String query = "UPDATE produit SET labelle='" + n_labelle
                    + "',prix=" + n_prix
                    + ",quantité=" + n_quantité
                    + "',type=" + n_type
                    + "WHERE id=" + id;
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);
            pst.executeUpdate();
            System.out.println("Produit bien modifié");
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    public void RechercheParLibelle(String labelle) {
        try {
            String query = "SELECT * FROM produit WHER labelle='%" + labelle + "%'";
            
            cnx = Connexion.Connexion();
            pst = cnx.prepareStatement(query);
            rst = (ResultSet) pst.executeQuery();
          
            if (rst.next()) {
                System.out.println("Produit trouvé");
            } else {
                System.out.println("pProduit non trouvé");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }

  /*  void AjouterProduit(int i, String labelle, int i0, String image, String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
