/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class AddLibrarianFXMLController implements Initializable {

    // database
    
    Statement statement;
    
    
    // Fxml
    
    @FXML
    private TextField LibrarianIdField;
    @FXML
    private TextField LibrarianNameField;
    @FXML
    private TextField LibrarianEmailField;
    @FXML
    private TextField LibrarianPassField;
    @FXML
    private TextField LibrarianContactField;
    @FXML
    private Button AddLibrarianButton;
    @FXML
    private Label addLibrarianLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handelButtonAction(ActionEvent event) {
        
        if(event.getSource() == AddLibrarianButton){
            AddLibraroan();
        }
    }
    
    /****
     * Insert Method
     * 
     * Librarian_Id , Librarian_Name  , Librarian_Email  , Password , Librarian_Contact
     */
    
     public void AddLibraroan() {
        try {
            statement = DatabaseConnection.getConnection().createStatement();
            statement.executeUpdate("insert into librarian (Librarian_Id,Librarian_Name,Librarian_Email,Password,Librarian_Contact) values"
                    + " ('" + LibrarianIdField.getText() + "','" 
                    + LibrarianNameField.getText() + "','" 
                    + LibrarianEmailField.getText() + "','" 
                    + LibrarianPassField.getText() +"' , " 
                    + LibrarianContactField.getText() + ")");
            
            addLibrarianLabel.setText("Added Successfully");
            addLibrarianLabel.setStyle("-fx-text-fill : Green");
            
        } catch (SQLException e) {
                
                    JOptionPane.showMessageDialog(null,"Error In Insert Method .....");
           // System.out.println(e.toString());
        }

    }
    
}
