/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.models;

import java.util.Date;

/**
 *
 * @author kshaw
 */
public class Rewards {
    
    private String username;
    private String rewName;
    private String rewDescript;
    private Date received;
    
    
    public Rewards(){}
    
    
    public Rewards(String username, String rewName, String rewDescript, Date received){
        
        this.username = username;
        this.rewName = rewName;
        this.rewDescript = rewDescript;
        this.received = received;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRewName() {
        return rewName;
    }

    public void setRewName(String rewName) {
        this.rewName = rewName;
    }

    public String getRewDescript() {
        return rewDescript;
    }

    public void setRewDescript(String rewDescript) {
        this.rewDescript = rewDescript;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }
    
    
}
