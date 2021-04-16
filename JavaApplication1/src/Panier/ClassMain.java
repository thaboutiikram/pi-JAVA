/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panier;


/**
 *
 * @author ikram
 */
public class ClassMain {
    
     public static void main(String[] args) {
      //  Connexion mc = Connexion.getInstance();
        Panier p=new Panier();
        CrudPanier cr= new CrudPanier();
        
        cr.ajouterPanier(p);
        cr.displayPanier();
        
        
      //  Panier p = new Panier(5, "aa", "5");
       // Panier c = new Panier(6, "esprit", "96");
       
       
}
}
