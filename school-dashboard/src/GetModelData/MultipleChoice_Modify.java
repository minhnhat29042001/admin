/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Category;
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


public class MultipleChoice_Modify {
      public static List<MultipleChoice> findAll() {
        List<MultipleChoice> MultipleChoiceList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from multiplechoice";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                MultipleChoice multiple = new MultipleChoice(
                        resultSet.getString("ID_mtpc"),
                        resultSet.getString("ID_course"),
                        resultSet.getString("question"),
                        resultSet.getString("optionA"),
                        resultSet.getString("optionB"),
                        resultSet.getString("optionC"),
                        resultSet.getString("optionD"),
                        resultSet.getString("correctAnswer"),
                        resultSet.getInt("score")
                       

                        
                          
                                                    
                    );
                MultipleChoiceList.add(multiple);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return MultipleChoiceList;
    }
      
      
       //insert
       public static void insert(MultipleChoice multipleChoice) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into multiplechoice set  ID_mtpc  =?,ID_course =?,question  =?,optionA =?,optionB =?,optionC=?,optionD =?,score=?,correctAnswer =?,";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1,multipleChoice.getID_MTPC());
            statement.setString(2,multipleChoice.getID_COURSE());
            statement.setString(3,multipleChoice.getQUESTION());
            statement.setString(4,multipleChoice.getOPTIONA());
            statement.setString(5,multipleChoice.getOPTIONB());
            statement.setString(6,multipleChoice.getOPTIONC());
            statement.setString(7,multipleChoice.getOPTIOND());
            statement.setInt(8,multipleChoice.getSCORE());
            statement.setString(9,multipleChoice.getCorrectAnswer());
            
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
       
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
       
       
    //update
       public static void update(MultipleChoice multipleChoice) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update multiplechoice set  ID_course =?,question  =?,optionA =?,optionB =?,optionC=?,optionD =?,score=?,correctAnswer =? where ID_mtpc  =?";
            statement = connection.prepareCall(sql);
        
            statement.setString(1,multipleChoice.getID_COURSE());
            statement.setString(2,multipleChoice.getQUESTION());
            statement.setString(3,multipleChoice.getOPTIONA());
            statement.setString(4,multipleChoice.getOPTIONB());
            statement.setString(5,multipleChoice.getOPTIONC());
            statement.setString(6,multipleChoice.getOPTIOND());
            statement.setInt(7,multipleChoice.getSCORE());
            statement.setString(8,multipleChoice.getCorrectAnswer());
            statement.setString(9,multipleChoice.getID_MTPC());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
          
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
       
       
       
        public static List<MultipleChoice> findmultiplechoicebyCourseID(String courseid) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<MultipleChoice> multiplechoiceList =new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from multiplechoice where ID_course like '%"+courseid+"%'";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               MultipleChoice mtp = new MultipleChoice(
                        resultSet.getString("ID_mtpc"),
                        resultSet.getString("ID_course"),
                        resultSet.getString("question"),
                        resultSet.getString("optionA"),
                        resultSet.getString("optionB"),
                        resultSet.getString("optionC"),
                        resultSet.getString("optionD"),
                        resultSet.getString("correctAnswer"),
                        resultSet.getInt("score")                                         
                    );
                
              multiplechoiceList.add(mtp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return multiplechoiceList;
    }  
        
        
        
          public static void delete(String mtplid) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "delete from multiplechoice  where 		ID_mtpc     = ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,mtplid);
     
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }  
}
