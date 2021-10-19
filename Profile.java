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
public class Profile {
    
    
    private String fname;
    private String lname;
    private String email;
    private String phone;
    private String username;
    private String bio;
    private String displayName;
    
    public Profile (){}
    
    public Profile(String fname, String lname, String email, String phone, String username, String bio, String displayName){
        
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.bio = bio;
        this.displayName = displayName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    
    
}
