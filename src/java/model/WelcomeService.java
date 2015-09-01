/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nagnello
 */
public class WelcomeService {
    private Date currentDate = new Date();
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    
    private String getPartOfDay(){
        int hour = currentDate.getHours();
        String answer = "";
        if(hour >= 5 && hour < 12)
            answer = "Good morning";
        else if(hour >= 12 && hour < 17)
            answer = "Good afternoon";
        else if(hour >= 17 && hour < 21)
            answer = "Good evening";
        else
            answer = "Go to Bed";
        
        return answer;
        
    }
    
    public String createMessage(String name){
        String message = "";
        
        message += getPartOfDay();
        message += ", " + name;
        
        
        return message;
    }
    
    
}
