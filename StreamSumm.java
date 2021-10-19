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
public class StreamSumm {
    
    private String username;
    private String title;
    private String description;
    private Date startTime;
    private Date endTime;
    private int numofViewers;
    private int newFollow;
    private int newSubs;
    
    public StreamSumm(){}
    
    public StreamSumm(String username, String title, String description, Date startTime, Date endTime, int numofViewers, int newFollow, int newSubs){
        
        this.username = username;
        this.title = title;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.numofViewers = numofViewers;
        this.newFollow = newFollow;
        this.newSubs = newSubs;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getNumofViewers() {
        return numofViewers;
    }

    public void setNumofViewers(int numofViewers) {
        this.numofViewers = numofViewers;
    }

    public int getNewFollow() {
        return newFollow;
    }

    public void setNewFollow(int newFollow) {
        this.newFollow = newFollow;
    }

    public int getNewSubs() {
        return newSubs;
    }

    public void setNewSubs(int newSubs) {
        this.newSubs = newSubs;
    }
    
    
}
