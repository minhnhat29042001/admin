/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Teacher;
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
public class Video_Modify {
      public static List<Video> findAll() {
        List<Video> VideoList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from video";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Video vid = new Video(
                        resultSet.getString("ID_video"),
                        resultSet.getString("ID_chapter"),
                        resultSet.getString("name_video"),
                        resultSet.getString("url")    
                                                    
                    );
               VideoList.add(vid);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return VideoList;
    }
      
      
      
       //insert
       public static void insert(Video video) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into Video set  ID_Video =?,ID_chapter=?,name_video=?,url=?,Course_ID=?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1,video.getID_VIDEO());
            statement.setString(2,video.getID_CHAPTER());
            statement.setString(3,video.getNAME_VIDEO());
            statement.setString(4,video.getURL_VIDEO());

         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"INSERT VIDEO SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
           //update
       public static void update(Video video) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update teacher set  ID_chapter=?,name_video=?,url=? where ID_Video=?";
            statement = connection.prepareCall(sql);
       
      
        
            statement.setString(1,video.getID_CHAPTER());
            statement.setString(2,video.getNAME_VIDEO());
            statement.setString(3,video.getURL_VIDEO());
            statement.setString(4,video.getID_VIDEO());
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                    JOptionPane.showMessageDialog(null,"UPDATE VIDEO SUCCESS","",2);
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Video_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
       
      public static List<Video> findVideobyCourseID(String courseid) {
       
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Video> VideoCourseLinklist = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "SELECT * FROM `video` join `chapter` WHERE video.ID_chapter = chapter.ID_chapter and ID_course = ?";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, courseid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                  Video video =new Video(
                   resultSet.getString("ID_video"),
                              resultSet.getString("ID_chapter"),
                              resultSet.getString("name_video"),
                              resultSet.getString("url")
                  );
                
              VideoCourseLinklist.add(video);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return VideoCourseLinklist;
    }  
      
      
      
      
      
      
      
      
        public static List<Video> findvideobyName(String name) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Video> VideoList =new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from video where name_video like '%"+name+"%'";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               Video vid = new Video(
                        resultSet.getString("ID_video"),
                        resultSet.getString("ID_chapter"),
                        resultSet.getString("name_video"),
                        resultSet.getString("url")    
                                                    
                    );
               VideoList.add(vid);
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
        return VideoList;
}
}
