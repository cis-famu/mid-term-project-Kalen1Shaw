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
public class Bits {
    
    private String username;
    private String streamer;
    private int numofBits;
    private double payment;
    
    public Bits(){}
    
    public Bits(String username, String streamer, int numofBits, double payment){
        
        this.username = username;
        this.streamer = streamer;
        this.numofBits = numofBits;
        this.payment = payment;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getStreamer() {
        return streamer;
    }

    public void setStreamer(String streamer) {
        this.streamer = streamer;
    }

    public int getNumofBits() {
        return numofBits;
    }

    public void setNumofBits(int numofBits) {
        this.numofBits = numofBits;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    
    
}
