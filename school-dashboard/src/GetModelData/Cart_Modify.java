/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GetModelData;

import Model.Cart;
import Model.Category;
import Model.Course;
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
public class Cart_Modify {
     public static List<Cart> findAll() {
        List<Cart> CartList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from cart";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Cart cart = new Cart(
                        resultSet.getString("ID_std"),
                              resultSet.getString("ID_course")

                        
                          
                                                    
                    );
                CartList.add(cart);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return CartList;
    }
     
     
     //insert
       public static void insert(Cart cart) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "insert into cart set  ID_std=?,ID_course=?";
                    
            statement = connection.prepareCall(sql);
            statement.setString(1, cart.getStd_id());
            statement.setString(2, cart.getCourse_id());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    } 
       
       
      //update
       public static void update(Cart cart) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "update cart set ID_course=? where ID_std=?";
            statement = connection.prepareCall(sql);
            statement.setString(2, cart.getStd_id());
            statement.setString(1,cart.getCourse_id());
      
         
            
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
       //find cart by student id
       public static List<Cart> findCartbyStudentID(String std_id) {
    
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<Cart> cartList =new ArrayList();
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "select * from cart where ID_std=? ";
            
            statement = connection.prepareStatement(sql);
            statement.setString(1, std_id);
        
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
              Cart cart = new Cart(
                        resultSet.getString("ID_std"),
                         resultSet.getString("ID_course")                                            
                    );
              cartList.add(cart);
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return cartList;
    }
       
        public static void delete(String courseid,String stdid) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinecourse", "root", "");
            String sql = "delete from cart  where ID_course =? and ID_std =?";
            statement = connection.prepareCall(sql);
            statement.setString(1, courseid);
            statement.setString(2, stdid);
     
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Cart_Modify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
