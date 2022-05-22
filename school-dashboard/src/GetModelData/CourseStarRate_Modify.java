/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Chapter;
import Model.CourseStarRate;
import Model.Teacher;
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
public class CourseStarRate_Modify {
       //insert
       public static void insert(CourseStarRate crs) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into coursestarrate set  Course_ID=?,Star=?,Student_ID =?";      
            statement = connection.prepareCall(sql);
            statement.setString(1,crs.getCourse_ID());
            statement.setInt(2,crs.getStar());
            statement.setString(3,crs.getStudent_ID());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       
          //update
       public static void update(CourseStarRate crs) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update teacher set  Star=? where Course_ID=? and Student_ID =? ";
            statement = connection.prepareCall(sql);
            statement.setInt(1,crs.getStar());
            statement.setString(2,crs.getCourse_ID());
            statement.setString(3,crs.getStudent_ID());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
       
       public static List<CourseStarRate> find(String courseid) {
       List<CourseStarRate> CourseStarRateList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
  
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from coursestarrate where Course_ID  like '%"+courseid+"%' ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, courseid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                CourseStarRate coursestarrate = new CourseStarRate(
                        resultSet.getString("Course_ID"),
                        resultSet.getInt("Star"),
                        resultSet.getString("Student_ID")
                   
                  
                   
                       

                        
                          
                                                    
                    );
               CourseStarRateList.add(coursestarrate);
              
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
        return CourseStarRateList;
    }  
       
       
       
    // find course star rate
        public static int findCourseStarRatebyID(String courserid) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        int star = 5;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "SELECT AVG(Star) FROM `coursestarrate` WHERE `Course_ID`= ?";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, courserid);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
               star = resultSet.getInt("AVG(star)");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(CourseStarRate_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return star;
    } 
        
        public static List<CourseStarRate> findAll() {
        List<CourseStarRate> CourseStarRateList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from coursestarrate";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                CourseStarRate coursestarrate = new CourseStarRate(
                        resultSet.getString("Course_ID"),
                        resultSet.getInt("Star"),
                        resultSet.getString("Student_ID")
                   
                  
                   
                       

                        
                          
                                                    
                    );
               CourseStarRateList.add(coursestarrate);
            }
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
        return CourseStarRateList;
    }    
}
