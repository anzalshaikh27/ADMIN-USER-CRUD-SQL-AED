/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author anzal
 */
public class UserHistory {
    

    public ArrayList<CreateUser> history;
   

    
    public UserHistory(){
    
        this.history = new ArrayList<CreateUser>();
}

    public ArrayList<CreateUser> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<CreateUser> history) {
        this.history = history;
    }
    
    
    public CreateUser addNewUser(){
        
        CreateUser user = new CreateUser();
        history.add(user);
        return user;
    
        
    }
    
   public void deleteUser(CreateUser vs){
        history.remove(vs);
    }
    
}


