package products;

import DataBase.Connexion;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;



import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Products {
 

   

    public void start(Stage stage) throws SQLException, IOException { 
                        

        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);        
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
     
       
       //AjouterProduit(1, 120, "way", 20, "image", "proteine");
        //SupprimerByID();
        //RechercheParLibelle()
        //ModifierProduit(int id, String n_labelle,int n_prix,int n_quantité,String n_type )
       
                throw new UnsupportedOperationException("Not supported yet.");
                //AfficherProduit(1,120,"way",20,"image","proteine");
        }
    
}




               



        
   
            
            
            
        
    
    

