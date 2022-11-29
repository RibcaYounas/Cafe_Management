/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author DELL
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String Mobile_Number;
    private String address;
    private String status;
    private String Password;

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public String getMobile_Number() {
        return Mobile_Number;
    }

    public void setMobile_number(String Mobile_Number) {
        this.Mobile_Number = Mobile_Number;
    }
     public String getStatus() {
        return status;
    }

    public void setStatus(String Status) {
        this.status = status;
    }
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
   
  
    
}
