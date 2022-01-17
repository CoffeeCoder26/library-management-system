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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AdminFXMLController implements Initializable {

    @FXML
    private Label AdminLabel;
    @FXML
    private TextField AdminNameFeild;
    @FXML
    private PasswordField AdminPassFeild;
    @FXML
    private Button LoginButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        
        

        if (AdminNameFeild.getText().equals("admin") && AdminPassFeild.getText().equals("admin")) {
            //  JOptionPane.showMessageDialog(null, "Login Success");
            AdminLabel.setText("Login Success");
            AdminLabel.setStyle("-fx-text-fill : Green");

            // loading Admin Section 
            
            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminSection.fxml"));
            Parent root = loader.load();
            AdminSectionController adminSectionController= loader.getController();
            Stage adminsectionStage = new Stage();

            Scene adminSectionScene = new Scene(root);
            adminsectionStage.setScene(adminSectionScene);
            adminsectionStage.setTitle("Admin Section Scene");
            adminsectionStage.show();
        } else {
            //JOptionPane.showMessageDialog(null, "Login Failed");
            AdminLabel.setText("Login Failed");
            AdminLabel.setStyle("-fx-text-fill : Red");

        }


    }

}
