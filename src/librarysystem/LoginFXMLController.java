/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.io.IOException;
import java.net.URL;
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
public class LoginFXMLController implements Initializable {

    @FXML
    private Button adminButton;
    @FXML
    private Button librarianButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException, InterruptedException {
        
        if(event.getSource() == adminButton){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminFXML.fxml"));
            Parent root = loader.load();
            AdminFXMLController adminFXMLController = loader.getController();
            Stage adminStage = new Stage();
            
            Scene adminScene = new Scene(root);
             adminStage.setScene(adminScene);
            adminStage.setTitle("Admin Scene");
            adminStage.show();
            
       }
        if(event.getSource() == librarianButton){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LibrarianFXML.fxml"));
            Parent root = loader.load();
            LibrarianFXMLController librarianFXMLController = loader.getController();
            Stage librarianStage = new Stage();
            
            Scene librarianScene = new Scene(root);
             librarianStage.setScene(librarianScene);
            librarianStage.setTitle("Lbrarian Scene");
            librarianStage.show();
        }
    }
    
}
