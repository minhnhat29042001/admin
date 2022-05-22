/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Admin;
import Model.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Admin_Modify {
     public static Admin findAdminbyUsername(String username) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Admin admin =new Admin();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from admin where 	username_admin  = ? ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               admin = new Admin(
                         resultSet.getString("ID_admin"),
                         resultSet.getString("name_admin"),
                         resultSet.getString("username_admin"),
                         resultSet.getString("password_admin"),
                         resultSet.getString("phonenumber_admin")
                        
                         
                       
                        
                        
                                                                
                    );
                
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return admin;
    }
     
    
}
