/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DatabaseConnection {
    
     private static Connection connection;
    
    public static Connection getConnection() {
        try {

            if (connection == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Connection Failed .....!");
        }

        return connection;
    }
    
//    public static void main(String[] args) {
//        getConnection();
//        
//    }
       
    
}
