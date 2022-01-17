/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 * FXML Controller class
 *
 * @author user
 */
public class LibrarianSectionController implements Initializable {

    @FXML
    private Button AddBookButton;
    @FXML
    private Button ViewBookButton;
    @FXML
    private Button BorrowBookButton;
    @FXML
    private Button ViewedBorrowBookButton;
    @FXML
    private Button ReturnBookButton;
    @FXML
    private Button LogoutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void hamdelButtonAction(ActionEvent event) {
    }
    
}
