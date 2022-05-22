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
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Chapter_Modify {
      public static List<Chapter> findAll() {
        List<Chapter> ChapterList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from chapter";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Chapter chap = new Chapter(
                        resultSet.getString("ID_chapter"),
                              resultSet.getString("ID_course"),
                         resultSet.getString("name_chapter")
                        

                        
                          
                                                    
                    );
                ChapterList.add(chap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ChapterList;
    }
      
      
      
      //insert
       public static void insert(Chapter chapter) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into chapter set  ID_chapter  =?,name_chapter =?,ID_course  =?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1, chapter.getID_CHAPTER());
            statement.setString(2, chapter.getNAME_CHAPTER());
            statement.setString(3, chapter.getID_COURSE());
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
          
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
       
      //update
       public static void update(Chapter chapter) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update chapter set  name_chapter =? ,ID_course=? where ID_chapter =?";
            statement = connection.prepareCall(sql);
            statement.setString(1, chapter.getNAME_CHAPTER());
            statement.setString(2, chapter.getID_COURSE());
            statement.setString(3, chapter.getID_CHAPTER());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
        
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
    
       
     public static List<Chapter> findChapterbyCourseID(String courseid) {
         List<Chapter> ChapterList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
  
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from chapter where 	ID_course  = ? ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, courseid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               Chapter chapter = new Chapter(
                        resultSet.getString("ID_chapter"),
                        resultSet.getString("ID_Course"),
                        resultSet.getString("name_chapter")
                       
                       
                        
                        
                                                                
                    );
                ChapterList.add(chapter);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ChapterList;
    }   
  


     public static List<Chapter> findChapterbyname(String name) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
          List<Chapter> ChapterList = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from chapter where name_chapter like '%"+name+"%' ";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
              

                Chapter chap = new Chapter(
                        resultSet.getString("ID_chapter"),
                              resultSet.getString("ID_course"),
                         resultSet.getString("name_chapter")
                        

                        
                          
                                                    
                    );
                ChapterList.add(chap);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        }  finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ChapterList;
    }     
     
     
     
     
     
     
      public static void delete(String chapterid) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/loginuser", "root", "");
            String sql = "delete from chapter  where 	ID_chapter    = ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,chapterid);
     
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Chapter_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }  
}
