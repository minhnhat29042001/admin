/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Review;
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
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class StudentLiked_Modify {
     public static List<StudentLiked> findAll() {
        List<StudentLiked> StudentLikedList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from studentliked";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                StudentLiked stdl = new StudentLiked(
                        resultSet.getString("ID_like"),
                        resultSet.getString("ID_std "),
                        resultSet.getString("ID_course ")
                  
                   
                       

                        
                          
                                                    
                    );
               StudentLikedList.add(stdl);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return StudentLikedList;
    }
     
     
      //insert
       public static void insert(StudentLiked studentLiked) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into studentliked set  ID_like =?,ID_std=?,ID_course=?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1,studentLiked.getID_LIKE());
            statement.setString(2,studentLiked.getID_STUDENT());
            statement.setString(3,studentLiked.getID_COURSE());
    
         
            
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"LIKE SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
         //update
       public static void update(StudentLiked studentliked) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update studentliked set  ID_std=?,ID_course=? where ID_like =?";
            statement = connection.prepareCall(sql);
       
       
            statement.setString(1,studentliked.getID_STUDENT());
            statement.setString(2,studentliked.getID_COURSE());
            statement.setString(3,studentliked.getID_LIKE());
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE STUDENT LIKED SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(StudentLiked_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
}
