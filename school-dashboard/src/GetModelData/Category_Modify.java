/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Course;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.*;
import java.sql.Date;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Category_Modify {
     public static List<Category> findAll() {
        List<Category> CategoryList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from category";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Category cate = new Category(
                        resultSet.getString("ID_cate"),
                              resultSet.getString("name_cate")

                        
                          
                                                    
                    );
                CategoryList.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return CategoryList;
    }
     
     
     //insert
       public static void insert(Category category) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into category set  ID_cate  =?,name_cate =?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1, category.getID_CATE());
            statement.setString(2, category.getNAME_CATE());
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"INSERT CATEGORY SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
       
       
      //update
       public static void update(Category category) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update category set  name_cate =? where ID_cate  =?";
            statement = connection.prepareCall(sql);
            statement.setString(1, category.getNAME_CATE());
            statement.setString(2, category.getID_CATE());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE CATEGORY SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }  
 
       
       //delete
       public static void delete(Cart cart) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "delete from category where 	ID_std =? AND ID_course=?";
            statement = connection.prepareCall(sql);
            statement.setString(1, cart.getStd_id());
            statement.setString(2, cart.getCourse_id());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE CATEGORY SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Category_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }  
}
