/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

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
import Model.*;

import com.raven.model.ModelStudent;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class Course_Modify {

    public static List<Course> findAll() {
        List<Course> CourseList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from course";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                InputStream is = resultSet.getBinaryStream("avatar");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);

                Course crs = new Course(
                        resultSet.getString("ID_course"),
                        resultSet.getString("ID_cate"),
                        resultSet.getString("ID_teacher"),
                        icon,
                        resultSet.getString("name_course"),
                        resultSet.getBoolean("isBlocked"),
                        resultSet.getString("brief_description"),
                        resultSet.getString("full_description"),
                        resultSet.getInt("score"),
                        resultSet.getInt("num_of_review"),
                        resultSet.getInt("num_of_std"),
                        resultSet.getInt("price"),
                        resultSet.getDate("create_date"),
                        resultSet.getDate("update_date")
                );
                CourseList.add(crs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
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
        return CourseList;
    }

         public static Course findCoursebyID(String courseid) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Course course =new Course();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from course where 	ID_course  = ? ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, courseid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                InputStream is = resultSet.getBinaryStream("avatar");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);
               course = new Course(
                        resultSet.getString("ID_course"),
                         resultSet.getString("ID_cate"),
                         resultSet.getString("ID_teacher"),
                         icon,
                         resultSet.getString("name_course"),
                         resultSet.getBoolean("isBlocked"),
                         resultSet.getString("brief_description"),
                         resultSet.getString("full_description"),
                         resultSet.getInt("score"),
                         resultSet.getInt("num_of_review"),
                         resultSet.getInt("num_of_std"),
                         resultSet.getInt("price"),
                         resultSet.getDate("create_date"),
                         resultSet.getDate("update_date")
                       
                        
                        
                                                                
                    );
                
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
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
        return course;
    }
        
         
         
          //insert
       public static void insert(Course course, String path) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into course set  ID_course =?, avatar =?,name_course =?,isBlocked =?,ID_cate =?,brief_description =?,full_description =?,ID_teacher =?,score =?,num_of_review =?,num_of_std =?,price=?,create_date=?,update_date=?";
                    
            statement = connection.prepareCall(sql);
            InputStream is = new FileInputStream(new File(path));
            statement.setString(1, course.getID_COURSE());
            statement.setBlob(2,is);
            statement.setString(3, course.getCOURSE_NAME());
            statement.setBoolean(4, course.isIsBLOCKED());
            statement.setString(5, course.getID_CATE());
            statement.setString(6, course.getBRIEF_DESCRIPTION());
            statement.setString(7, course.getFULL_DESCRIPTION());
            statement.setString(8, course.getID_TEACHER());
            statement.setDouble(9, course.getSCORE());
            statement.setInt(10, course.getNUM_REVIEW());
            statement.setInt(11, course.getNUM_STUDENT());
            statement.setInt(12, course.getPRICE());
             java.util.Date utilStartDate =  course.getCREATE_DATE();
             java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime()); 
             java.util.Date utilStartDate2 =  course.getUPDate_DATE();
             java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime()); 
            statement.setDate(13,sqlStartDate);
            statement.setDate(14,sqlStartDate2);
  
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
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
    }

       
       
       
       
       
       
        //update
       public static void update(Course course, String path) {
              if(path==null){
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update course set name_course =?,isBlocked =?,ID_cate =?,brief_description =?,full_description =?,ID_teacher =?,	score =?,num_of_review =?,num_of_std =?,price =?,create_date=?,update_date=? where ID_course  =?";
            statement = connection.prepareCall(sql);
         
            statement.setString(1, course.getCOURSE_NAME());
            statement.setBoolean(2, course.isIsBLOCKED());
            statement.setString(3, course.getID_CATE());
            statement.setString(4, course.getBRIEF_DESCRIPTION());
            statement.setString(5, course.getFULL_DESCRIPTION());
            statement.setString(6, course.getID_TEACHER());
            statement.setDouble(7, course.getSCORE());
            statement.setInt(8, course.getNUM_REVIEW());
            statement.setInt(9, course.getNUM_STUDENT());
            statement.setInt(10, course.getPRICE());
            java.util.Date utilStartDate =  course.getCREATE_DATE();
            java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime()); 
            java.util.Date utilStartDate2 =  course.getUPDate_DATE();
            java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime()); 
            statement.setDate(11, sqlStartDate);
            statement.setDate(12, sqlStartDate2);
            statement.setString(13, course.getID_COURSE());
      
         
            
            
            statement.execute();
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
            } else{
                   Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update course set  avatar =?,name_course =?,isBlocked =?,ID_cate =?,brief_description =?,full_description =?,ID_teacher =?,	score =?,num_of_review =?,num_of_std =?,price =?,create_date=?,update_date=? where ID_course  =?";
            statement = connection.prepareCall(sql);
         
            InputStream is = new FileInputStream(new File(path));
            statement.setBlob(1, is);
            statement.setString(2, course.getCOURSE_NAME());
            statement.setBoolean(3, course.isIsBLOCKED());
            statement.setString(4, course.getID_CATE());
            statement.setString(5, course.getBRIEF_DESCRIPTION());
            statement.setString(6, course.getFULL_DESCRIPTION());
            statement.setString(7, course.getID_TEACHER());
            statement.setDouble(8, course.getSCORE());
            statement.setInt(9, course.getNUM_REVIEW());
            statement.setInt(10, course.getNUM_STUDENT());
            statement.setInt(11, course.getPRICE());
            java.util.Date utilStartDate =  course.getCREATE_DATE();
            java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime()); 
            java.util.Date utilStartDate2 =  course.getUPDate_DATE();
            java.sql.Date sqlStartDate2 = new java.sql.Date(utilStartDate2.getTime()); 
            statement.setDate(11, sqlStartDate);
            statement.setDate(12, sqlStartDate2);
            statement.setString(14, course.getID_COURSE());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
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
              }
      
    }



     public static List<Course> findCoursebyname(String name) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
          List<Course> CourseList = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from course where name_course like '%"+name+"%' ";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               InputStream is = resultSet.getBinaryStream("avatar");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);

                Course crs = new Course(
                        resultSet.getString("ID_course"),
                        resultSet.getString("ID_cate"),
                        resultSet.getString("ID_teacher"),
                        icon,
                        resultSet.getString("name_course"),
                        resultSet.getBoolean("isBlocked"),
                        resultSet.getString("brief_description"),
                        resultSet.getString("full_description"),
                        resultSet.getInt("score"),
                        resultSet.getInt("num_of_review"),
                        resultSet.getInt("num_of_std"),
                        resultSet.getInt("price"),
                        resultSet.getDate("create_date"),
                        resultSet.getDate("update_date")
                );
                CourseList.add(crs);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Course_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
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
        return CourseList;
    }
     
     
       public static void delete(String courseid) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "delete from course  where 	ID_course   = ? ";
            statement = connection.prepareCall(sql);
            statement.setString(1,courseid);
     
            statement.execute();
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
    }  
       
}
