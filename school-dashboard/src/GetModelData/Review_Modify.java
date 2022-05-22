/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Register;
import Model.Review;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Review_Modify {
      public static List<Review> findAll() {
        List<Review>ReviewList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from review";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Review re = new Review(
                        resultSet.getString("ID_review"),
                        resultSet.getString("ID_course "),
                        resultSet.getString("ID_std "),
                        resultSet.getInt("star"),
                        resultSet.getString("comment")
                   
                       

                        
                          
                                                    
                    );
               ReviewList.add(re);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ReviewList;
    }
      
       //insert
       public static void insert(Review review) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into review set ID_review =?,comment=?,star=?,ID_std=?,ID_course=?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1,review.getID_REVIEW());
            statement.setString(2,review.getCOMMENT());
            statement.setInt(3,review.getStar());
            statement.setString(4,review.getID_STUDENT());
            statement.setString(5,review.getID_COURSE());
         
            
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"REVIEW SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
        //update
       public static void update(Review review) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update review set  comment=?,star=?,ID_std=?,ID_course=? where ID_review =?";
            statement = connection.prepareCall(sql);
       
           
            statement.setString(1,review.getCOMMENT());
            statement.setInt(2,review.getStar());
            statement.setString(3,review.getID_STUDENT());
            statement.setString(4,review.getID_COURSE());
            statement.setString(5,review.getID_REVIEW());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE REVIEW SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Review_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
}
