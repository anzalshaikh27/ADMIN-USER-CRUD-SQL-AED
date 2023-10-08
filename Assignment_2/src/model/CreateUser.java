/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

/**
 *
 * @author anzal
 */
public class CreateUser {
    
   
    public int neu_id;
    public String fname;
    public String lname;
    public int age;
    public String address;
    public String email;
    public int phone;
    public int pincode;
    public String username;
    public String password;
    public String status;
    //public String hashedPassword = hash.hashPassword(password);
    

    public String getUsername() {
        return username;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //hash.hashPassword(password);
        this.password = password;
    }

    public int getNeu_id() {
        return neu_id;
    }

    public void setNeu_id(int neu_id) {
        this.neu_id = neu_id;
    }

   

    

    

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
    
    @Override
public String toString(){
    return fname;
   // return lname;
    
}

    public class hash{
public static String hashPassword(String password) {
        try {
            // Create a MessageDigest instance for the SHA-256 algorithm
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            
            // Add the password bytes to the digest
            md.update(password.getBytes());
            
            // Generate the hashed password bytes
            byte[] hashedPasswordBytes = md.digest();
            
            // Convert the hashed bytes to a Base64-encoded string
            String hashedPassword = Base64.getEncoder().encodeToString(hashedPasswordBytes);
            
            return hashedPassword;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null; // Handle the exception appropriately in your code
        }
    }
   
    }
    
}
