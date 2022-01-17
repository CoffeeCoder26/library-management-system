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

/**
 * FXML Controller class
 *
 * @author user
 */
public class LibrarianFXMLController implements Initializable {

    @FXML
    private Label LibrarianLabel;
    @FXML
    private TextField LibrarianNameFeild;
    @FXML
    private PasswordField LibrarianPassFeild;
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

        if (LibrarianNameFeild.getText().equals("Ahmed") && LibrarianPassFeild.getText().equals("0000")) {
            //  JOptionPane.showMessageDialog(null, "Login Success");
            LibrarianLabel.setText("Librarian Login Success");
            LibrarianLabel.setStyle("-fx-text-fill : Green");

            // load Librarian section
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LibrarianSection.fxml"));
            Parent root = loader.load();
            LibrarianSectionController  librarianSectionController= loader.getController();
            Stage librarianSectionStage = new Stage();

            Scene librarianSectionScene = new Scene(root);
            librarianSectionStage.setScene(librarianSectionScene);
            librarianSectionStage.setTitle("Library Section Scene");
            librarianSectionStage.show();

        } else {
            //JOptionPane.showMessageDialog(null, "Login Failed");
            LibrarianLabel.setText("Librarian Login Failed");
            LibrarianLabel.setStyle("-fx-text-fill : Red");

        }

    }

}
