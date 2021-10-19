/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.models;

/**
 *
 * @author kshaw
 */
public class Subs {
    
    private String Subusername;
    private int payment;
    private String subMessage;
    private String subDuration;
    
    public Subs(){}
    
    public Subs(String Subusername, int payment, String subMessage, String subDuration){
        
        this.Subusername = Subusername;
        this.payment = payment;
        this.subMessage = subMessage;
        this.subDuration = subDuration;
    }

    public String getSubusername() {
        return Subusername;
    }

    public void setSubusername(String Subusername) {
        this.Subusername = Subusername;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public String getSubMessage() {
        return subMessage;
    }

    public void setSubMessage(String subMessage) {
        this.subMessage = subMessage;
    }

    public String getSubDuration() {
        return subDuration;
    }

    public void setSubDuration(String subDuration) {
        this.subDuration = subDuration;
    }
    
    
    
    
    
}
