/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AdminSectionController implements Initializable {
    
    Statement statement;
    PreparedStatement preparedStatement;

    @FXML
    private Button ButtonAddLibrarian;
    @FXML
    private Button ButtonViewLibrarian;
    @FXML
    private Button ButtonDeleteLibrarian;
    
    // i don't need to handel logout button
   

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        if(event.getSource() == ButtonAddLibrarian){
            
             // load  Add Librarian section
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AddLibrarianFXML.fxml"));
            Parent root = loader.load();
            AddLibrarianFXMLController  addLibrarianFXMLController = loader.getController();
            Stage addLibrarianStage = new Stage();

            Scene addlibrarianScene = new Scene(root);
            addLibrarianStage.setScene(addlibrarianScene);
            addLibrarianStage.setTitle("Add Library Scene");
            addLibrarianStage.show();
        }
        
        
        if(event.getSource() == ButtonViewLibrarian){
            
             // load  View Librarian section
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewLibrarianFXML.fxml"));
            Parent root = loader.load();
            ViewLibrarianFXMLController  viewLibrarianFXMLController = loader.getController();
            Stage viewLibrarianStage = new Stage();

            Scene viewlibrarianScene = new Scene(root);
            viewLibrarianStage.setScene(viewlibrarianScene);
            viewLibrarianStage.setTitle("View Library Scene");
            viewLibrarianStage.show();
            
            
        }
        
    }
    
   
    
}
