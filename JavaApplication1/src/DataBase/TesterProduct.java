/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

/**
 *
 * @author ikram
 */
public class TesterProduct {
    public static void main(String[] args) {
        Product pr=new Product();
        
        pr.AfficherProduit();
       
       //String query = "INSERT INTO produit VALUES(" + id + ",'" + labelle + "'," + prix + "," + quantité + ",'" + image + "'," + type + ")";
    // pr.AjouterProduit( 12, "tapis", 3 , "image", "type");
        //pr.ModifierProduit(2, "bbb", 10, 10, "type");
       pr.SupprimerByID(10);
      //pr.AjouterProduit(10, "labelle", 10, "image", "type");
     // pr.RechercheParLibelle("qqqq");
    }
    
   
}
