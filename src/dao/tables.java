/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class tables {
    public static void main(String[] args)
    {
    try{
       
     //   String userTable = "create table user1(id int AUTO_INCREMENT primary key,name varchar(200), email varchar(200),Mobile_Number varchar(11),address varchar(200),Password varchar(200),UNIQUE (email) )" ;
        String adminDetails = "insert into user1(id,name,email,Mobile_Number,address,Password) values('2','Admin1','admin1@gmail.com','03123456788','Lahore','123')" ;
     //   DbOperations.setDataOrDelete(userTable,"User Table Created Successfully."); 
         DbOperations.setDataOrDelete(adminDetails,"Admin details added successfully Successfully."); 
    }
    catch(Exception e)
    {
     JOptionPane.showMessageDialog(null,e);
    
    }
    }
}
