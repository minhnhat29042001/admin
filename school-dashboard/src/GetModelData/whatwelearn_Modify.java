/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.StudentLiked;
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
import java.awt.Image;
import java.sql.Blob;
import java.sql.PreparedStatement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class whatwelearn_Modify {
      public static List<Whatwelearn> findAll() {
        List<Whatwelearn> WhatwelearnList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from whatwelearned";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Whatwelearn whatwelearn = new Whatwelearn(
                        resultSet.getString("ID_course"),
                        resultSet.getString("whatWeLearned")
                      
                  
                   
                       

                        
                          
                                                    
                    );
               WhatwelearnList.add(whatwelearn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return WhatwelearnList;
    }
      
      
       //insert
       public static void insert(Whatwelearn whatwelearn) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into whatwelearned set  ID_course =?,	whatWeLearned=? ";
            ImageIcon image =new ImageIcon();
            statement = connection.prepareCall(sql);
            statement.setString(1,whatwelearn.getID_COURSE());
            statement.setString(2,whatwelearn.getWHATWELEARN());
       
    
         
            
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"INSERT TEACHER SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
          //update
       public static void update(Whatwelearn whatwelearn) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update whatwelearned set  whatWeLearned=? where ID_course=?";
            statement = connection.prepareCall(sql);
       
      
     
            statement.setString(2,whatwelearn.getID_COURSE());
            statement.setString(1,whatwelearn.getWHATWELEARN());
     
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE TEACHER SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
       
       
       
         public static List<Whatwelearn> findWhatwelearnbyCourseID(String courseid) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Whatwelearn> WhatwelearnList =new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from multiplechoice where ID_course like '%"+courseid+"%'";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
              Whatwelearn whatwelearn = new Whatwelearn(
                        resultSet.getString("ID_course"),
                        resultSet.getString("whatWeLearned")
                      
                  
                   
                       

                        
                          
                                                    
                    );
               WhatwelearnList.add(whatwelearn);
            }
        } catch (SQLException ex) {
            Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return WhatwelearnList;
    } 
         
         
         
         
           public static void delete(String whatwelearn) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "delete from whatwelearned  where whatWeLearned= ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,whatwelearn);
     
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(whatwelearn_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }  
}
