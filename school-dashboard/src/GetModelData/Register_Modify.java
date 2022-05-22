/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;
import Model.*;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Register_Modify {
      public static List<Register> findAll() {
        List<Register> RegisterList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from register";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Register regis = new Register(
                        resultSet.getString("ID_register"),
                        resultSet.getString("ID_course"),
                        resultSet.getString("ID_std"),
                        resultSet.getBoolean("AdminAccepted")
                   
                       

                        
                          
                                                    
                    );
                RegisterList.add(regis);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return RegisterList;
    }
      
      public static Register getLatestID() {  
       
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Register reg = new Register();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select ID_register from `register` where ID_register IN (Select MAX(ID_register) from `register`)";
            
            statement = connection.prepareStatement(sql);
            
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                reg = new Register(
                       resultSet.getString("ID_register")
                );
                
              
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
        return reg;
    }
      
       //insert
       public static void insert(Register register) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into register set  ID_register =?,ID_std=?,ID_course=?,AdminAccepted=?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1,register.getID_REGISTER());
            statement.setString(2,register.getID_STUDENT());
            statement.setString(3,register.getID_COURSE());
            statement.setBoolean(4,register.getAdminAcceptedBoolean());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
}
       
       //update
       public static void update(Boolean block,String idregister) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update register set  AdminAccepted=? where ID_register =?";
            statement = connection.prepareCall(sql);
            statement.setBoolean(1,block);
            statement.setString(2,idregister);
          

      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
             
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Register_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }     
       
       
      public static List<Register> findStudentregisterbyid(String idstd) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
      
          List<Register> RegisterList = new ArrayList<>();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from register where ID_std like '%"+idstd+"%' ";
            
            statement = connection.prepareStatement(sql);
    
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
             Register regis = new Register(
                        resultSet.getString("ID_register"),
                        resultSet.getString("ID_course"),
                        resultSet.getString("ID_std"),
                        resultSet.getBoolean("AdminAccepted")
                   
                       

                        
                          
                                                    
                    );
                
              RegisterList.add(regis);
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
        return RegisterList;
    }
}
