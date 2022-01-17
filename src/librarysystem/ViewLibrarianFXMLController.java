/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author user
 */
public class ViewLibrarianFXMLController implements Initializable {

    Librarian librarian;
//    ViewLibrarianFXMLController viewLibrarianFXMLController = new ViewLibrarianFXMLController();
    //Database
    PreparedStatement preparedStatement;
    Statement statement;
    ResultSet resultSet;

    @FXML
    private TableView<Librarian> LibrariansTable;
    @FXML
    private TableColumn<Librarian, String> LibrarianIdColumn;
    @FXML
    private TableColumn<Librarian, String> LibrarianNameColumn;
    @FXML
    private TableColumn<Librarian, String> LibrarianEmailColumn;
    @FXML
    private TableColumn<Librarian, String> PassColumn;
    @FXML
    private TableColumn<Librarian, String> ContactColumn;
    @FXML
    private Button deleteButton;
    @FXML
    private TextField idLibrarianField;
    @FXML
    private TextField LibraraianIdField;
    @FXML
    private TextField LibraraianContactField;
    @FXML
    private TextField LibraraianNameField;
    @FXML
    private TextField LibraraianEmailField;
    @FXML
    private TextField LibraraianPassField;
    @FXML
    private Button updateButton;
    @FXML
    private Label label;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        showLibrarians();
    }

    /**
     * *
     *
     * Get all Data About librarians
     */
    public ObservableList<Librarian> getLibrarianData() {
        //Hint
        ObservableList<Librarian> librarianList = FXCollections.observableArrayList();
        try {
            statement = DatabaseConnection.getConnection().createStatement();
            String sqlQuery = "SELECT * FROM `librarian`";
            resultSet = statement.executeQuery(sqlQuery);

            // there is an para constructor in BookData Class
            while (resultSet.next()) {
                librarian = new Librarian(resultSet.getInt(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6));
                librarianList.add(librarian);
            }

        } catch (SQLException e) {
            e.toString();
        }

        return librarianList;
    }

    //Method to Show Librarians In Tabel
    public void showLibrarians() {

        ObservableList<Librarian> librarianlist = getLibrarianData();

        LibrarianIdColumn.setCellValueFactory(new PropertyValueFactory<>("Librarian_Id"));
        LibrarianNameColumn.setCellValueFactory(new PropertyValueFactory<>("Librarian_Name"));
        LibrarianEmailColumn.setCellValueFactory(new PropertyValueFactory<>("Librarian_Email"));
        PassColumn.setCellValueFactory(new PropertyValueFactory<>("Librarian_Pass"));
        ContactColumn.setCellValueFactory(new PropertyValueFactory<>("Contact"));

        LibrariansTable.setItems(librarianlist);

    }

    @FXML
    private void handelbuttonAction(ActionEvent event) throws SQLException {
        if (event.getSource() == deleteButton) {
            DeleteLibrarian();
        }

        if (event.getSource() == updateButton) {

            updateLibrarian();

        }
    }

    /*
     *
     * Delete librarian Method
     *
     */
    public void DeleteLibrarian() throws SQLException {

        statement = DatabaseConnection.getConnection().createStatement();
        String sqlQuery = "delete from Librarian where Librarian_Id = " + idLibrarianField.getText() + "";
        statement.executeUpdate(sqlQuery);
        LibrariansTable.setItems(getLibrarianData());

    }

    /**
     * *
     * Update Method
     *
     * @param
     * @return
     */
    public void updateLibrarian() {
        try {
            String sql = "update Librarian set Librarian_Name = ?  ,Librarian_Email = ? , Password = ? , Librarian_Contact = ? where Librarian_Id = ?";

            preparedStatement = DatabaseConnection.getConnection().prepareStatement(sql);
            //
            preparedStatement.setString(1, LibraraianNameField.getText());
            preparedStatement.setString(2, LibraraianEmailField.getText());
            preparedStatement.setString(3, LibraraianPassField.getText());
            preparedStatement.setString(4, LibraraianContactField.getText());
            preparedStatement.setInt(5, Integer.parseInt(LibraraianIdField.getText()));
            
            preparedStatement.executeUpdate();
            label.setText("Data Is Updated");
            label.setStyle("-fx-text-fill:Green");

            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error In Update Method .....");
           
        }

    }

}
