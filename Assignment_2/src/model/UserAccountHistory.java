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
public class UserAccountHistory {
    
     public ArrayList<CreateUserAccount> historyaccount;
     
     public UserAccountHistory(){
         
         this.historyaccount = new ArrayList<CreateUserAccount>();
         
     }

    public ArrayList<CreateUserAccount> getHistoryaccount() {
        return historyaccount;
    }

    public void setHistoryaccount(ArrayList<CreateUserAccount> historyaccount) {
        this.historyaccount = historyaccount;
    }
 
     public CreateUserAccount addNewUserAccount(){
        
        CreateUserAccount cu = new CreateUserAccount();
        historyaccount.add(cu);
        return cu;
    }
    
}
