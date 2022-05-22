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
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
public class Teacher_Modify {
      public static List<Teacher> findAll() {
        List<Teacher> TeacherList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from teacher";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                 InputStream is = resultSet.getBinaryStream("AvatarURL");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);
                Teacher teacher = new Teacher(
                        resultSet.getString("ID_teacher"),
                        resultSet.getString("name_teacher"),
                        resultSet.getString("role_teacher"),
                        resultSet.getString("phonenumber_teacher"),
                        resultSet.getString("experience"),
                        icon
                  
                   
                       

                        
                          
                                                    
                    );
               TeacherList.add(teacher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
              Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return TeacherList;
    }
      
      
       //insert
       public static void insert(Teacher teacher,String path) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into teacher set  ID_teacher  =?,name_teacher=?,role_teacher=?,phonenumber_teacher=?,experience=?,AvatarURL=?";
                    
            statement = connection.prepareCall(sql);
            InputStream is = new FileInputStream(new File(path));
            statement.setString(1,teacher.getID_TEACHER());
            statement.setString(2,teacher.getNAME_TEACHER());
            statement.setString(3,teacher.getROLE_TEACHER());
            statement.setString(4,teacher.getPHONE_NUMBER());
            statement.setString(5,teacher.getEXPERIENCE());
            statement.setBlob(6,is);
    
         
            
       
   
            
  
         
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
              Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
            if (statement != null) {
                try {
                    statement.close();
            
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
          //update
       public static void update(Teacher teacher,String path) {
           if(path==null){
                            Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update teacher set  name_teacher=?,role_teacher=?,phonenumber_teacher=?,experience=? where ID_teacher  =?";
            statement = connection.prepareCall(sql);
   
      
            statement.setString(1,teacher.getNAME_TEACHER());
            statement.setString(2,teacher.getROLE_TEACHER());
            statement.setString(3,teacher.getPHONE_NUMBER());
            statement.setString(4,teacher.getEXPERIENCE());
     
            statement.setString(5,teacher.getID_TEACHER());
  
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                 
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
           }else{
                 Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update teacher set  name_teacher=?,role_teacher=?,phonenumber_teacher=?,experience=?,AvatarURL=? where ID_teacher  =?";
            statement = connection.prepareCall(sql);
            InputStream is = new FileInputStream(new File(path));
      
            statement.setString(1,teacher.getNAME_TEACHER());
            statement.setString(2,teacher.getROLE_TEACHER());
            statement.setString(3,teacher.getPHONE_NUMBER());
            statement.setString(4,teacher.getEXPERIENCE());
            statement.setBlob(5, is);
            statement.setString(6,teacher.getID_TEACHER());
  
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
              Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
            if (statement != null) {
                try {
                    statement.close();
        
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
           }
      
    }     
       
       public static Teacher findteacherbyID(String teacherid) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Teacher teacher =new Teacher();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from teacher where 	ID_teacher  = ? ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, teacherid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                InputStream is = resultSet.getBinaryStream("AvatarURL");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);
               teacher = new Teacher(
                        resultSet.getString("ID_teacher"),
                         resultSet.getString("name_teacher"),
                         resultSet.getString("role_teacher"),
                         resultSet.getString("phonenumber_teacher"),
                         resultSet.getString("experience"),
                         icon
                       
                       
                        
                        
                                                                
                    );
                
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
              Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
          } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return teacher;
    }  
       
       
       
       
       
    public static List<Teacher> findWTeacherbyName(String name) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Teacher> TeacherList =new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from teacher where name_teacher like '%"+name+"%'";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
              InputStream is = resultSet.getBinaryStream("AvatarURL");
                // Decode the inputstream as BufferedImage
                BufferedImage bufImg = null;
                bufImg = ImageIO.read(is);
                Image image = bufImg;
                ImageIcon icon = new ImageIcon(image);
                Teacher teacher = new Teacher(
                        resultSet.getString("ID_teacher"),
                        resultSet.getString("name_teacher"),
                        resultSet.getString("role_teacher"),
                        resultSet.getString("phonenumber_teacher"),
                        resultSet.getString("experience"),
                        icon
                  
                   
                       

                        
                          
                                                    
                    );
               TeacherList.add(teacher);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MultipleChoice_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
              Logger.getLogger(Teacher_Modify.class.getName()).log(Level.SEVERE, null, ex);
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
        return TeacherList;
    }   
}
