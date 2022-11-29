/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import model.User;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author DELL
 */
public class UserDao {
    public static void save(User user){
     String query = "insert into user(name,email,Mobile_Number,status,address,Password) values(" + user.getName()+ "','" + user.getEmail()+"','"+user.getMobile_Number()+"',"+ user.getStatus()+"','"+user.getAddress()+"','"+user.getPassword()+")";
     DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for the Admin Approval!");
    }
    public static User Login(String email, String password){
        User user=null;
        try{
         ResultSet rs = DbOperations.getData("Select * from user where email='"+email+"' and password=' "+password+"'");
         while (rs.next()){
             user=new User();
             user.setStatus(rs.getString("status"));
         }
        }
         catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
        
    }
        return user;
    }
    
}
