package products;

import DataBase.Connexion;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Products {
 
   private Connexion ;
   private Statement st;
   private Resultat rst;

    public void start(Stage stage) throws SQLException, IOException { 
                        

        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
  
    public void main(String[] args) {
        //AjouterProduit(1, 120, way, 20, image, proteine);
        //SupprimerByID();
        //RechercheParLibelle()
        //ModifierProduit(int id, String n_labelle,int n_prix,int n_quantité,String n_type )
        try {
            Connexion connex1=new Connexion();
            st=(Statement) connex1.CreateStatement();
            rst=(Resultat) st.executeQuery("SELECT * FROM produit");
            while(rst.next()){
                System.out.println(rst.getInt ("id")+"\t");
                System.out.println(rst.getInt ("prix")+"\t");
                System.out.println(rst.getvarchar ("labelle")+"\t");
                System.out.println(rst.getInt ("quantité")+"\t");
                System.out.println(rst.getvarchar ("image")+"\t");
                System.out.println(rst.getvarchar ("type")+"\t");
                
            }
        }
            catch (Exception e) {
                e.printStackTrace();
            }
                //throw new UnsupportedOperationException("Not supported yet.");

        }
    public void AjouterProduit(int id,int prix,String labelle,int quantité,String image,String type) {
        try{
            String query="INSERT INTO produit VALUES("+id+",'"+labelle+"',"+prix+","+quantité+",'"+image+"',"+type+")";
    connex1=Connexion();
    st=connex1.CreateStatement();
    st.executeUpdate("Produit ajouté");




        }
        catch(SQLException e){
            System.out.println(e.getMessage());}
        }
    public void SupprimerByID(int id) {
        try{
            String query="DELETE FROM PRODUIT WHERE id="+id;
            connex1=Connexion();
            st=connex1.CreateStatement();
            st.executeUpdate(query);
            System.out.println("Produit bien supprimé");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
            
            
        }
        
    }
    public static void ModifierProduit(int id, String n_labelle,int n_prix,int n_quantité,String n_type ) {
        
        try{
            String query="UPDATE produit SET labelle='"+n_labelle
                    +"',prix="+n_prix
                    +",quantité="+n_quantité
                    +"',type="+n_type
                    +"WHERE id="+id;
        connex1=connexion();
        st=connex1.CreateStatement();
        st.executeUpdate(query);
            System.out.println("Produit bien modifié");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
            
                    
        }
    }
    public static void RechercheParLibelle(String labelle) {
 try{
     String query="SELECT * FROM produit WHER labelle='"+labelle+"'";
     connex1=Connexion();
     st=connx1.createStatement();
     rst=st.executeQuery(query);
     rst.last();
     int nbrRow=rst.getRow();
     if(nbrRow!=0){
         System.out.println("Produit trouvé");
     }
     else{
         System.out.println("pProduit non trouvé");
     }
     
  
 }   catch(SQLException e){
     System.out.println(e.getMessage());
     
 }    
    }
}




               



        
   
            
            
            
        
    
    

