/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Cart;
import Model.Course;
import Model.Student;
import Model.Teacher;
import com.raven.model.ModelStudent;
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

/**
 *
 * @author Admin
 */
public class Student_Modify {
    
     public static List<ModelStudent> findAll() {
        List<ModelStudent> ModelStudentList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from student";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                ModelStudent modelStudent = new ModelStudent(
                       resultSet.getString("ID_std"),
                         resultSet.getBoolean("isBlocked"),
                         resultSet.getString("phonenumber_std"),
                         resultSet.getString("std_name"),
                         resultSet.getString("gender"),
                         resultSet.getString("username_std"),
                         resultSet.getString("password_std"),
                       resultSet.getString("birthday_std"),
                       resultSet.getString("city_std"),
                       resultSet.getString("address_std")
                  
                   
                       

                        
                          
                                                    
                    );
               ModelStudentList.add(modelStudent);
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
        return ModelStudentList;
    }
    
    
    
    
     public static List<ModelStudent> findStudentbyname(String name) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
          List<ModelStudent> ModelStudentList = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from student where std_name like '%"+name+"%' ";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
              ModelStudent  student = new ModelStudent(
                         resultSet.getString("ID_std"),
                         resultSet.getBoolean("isBlocked"),
                         resultSet.getString("phonenumber_std"),
                         resultSet.getString("std_name"),
                         resultSet.getString("gender"),
                         resultSet.getString("username_std"),
                         resultSet.getString("password_std"),
                       resultSet.getString("birthday_std"),
                       resultSet.getString("city_std"),
                       resultSet.getString("address_std")
                         
                       
                        
                        
                                                                
                    );
                
              ModelStudentList.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return ModelStudentList;
    }
     
     
     //update infostudent
    
       public static void updateSTDbyID(String std_id,String fullname,String phonenumber, String birthdate, String gender,String city,String address ) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update student set std_name=?,phonenumber_std=?,birthday_std=?,gender=?,city_std=?,address_std=? where ID_std=?";
            statement = connection.prepareCall(sql);
            statement.setString(1,fullname);
                 statement.setString(2,phonenumber);
                      statement.setString(3,birthdate);
                           statement.setString(4,gender);
                                statement.setString(5,city);
                                     statement.setString(6,address);
                                      statement.setString(7,std_id);
           
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
       
       
       
       
        //update infostudent
    
       public static void updatepasswordSTDbyID(String std_id,String password) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update student set password_std=? where ID_std=?";
            statement = connection.prepareCall(sql);
            statement.setString(1,password);
            statement.setString(2,std_id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
       
       
       
       
       
       
          //update block student
    
       public static void updateBlockSTDbyID(String std_id,Boolean block) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update student set isBlocked=? where ID_std=?";
            statement = connection.prepareCall(sql);
            statement.setBoolean(1,block);
            statement.setString(2,std_id);
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Student_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
