/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.models;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author kshaw
 */

@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class StreamActivity {
    
    private @XmlAttribute String streamTitle;
    private @XmlAttribute String description;
    private @XmlAttribute String gameName;
    private ArrayList<Bits> sentBits;
    private ArrayList<Subs> newSubs;
    
    public StreamActivity(){}
    
    public StreamActivity(String streamTitle, String description, String gameName, ArrayList<Bits> sentBits, ArrayList<Subs> newSubs){
        
        this.streamTitle = streamTitle;
        this.description = description;
        this.gameName = gameName;
        this.sentBits = sentBits;
        this.newSubs = newSubs;
    }

    public String getStreamTitle() {
        return streamTitle;
    }

    public void setStreamTitle(String streamTitle) {
        this.streamTitle = streamTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public ArrayList<Bits> getSentBits() {
        return sentBits;
    }

    public void setSentBits(ArrayList<Bits> sentBits) {
        this.sentBits = sentBits;
    }

    public ArrayList<Subs> getNewSubs() {
        return newSubs;
    }

    public void setNewSubs(ArrayList<Subs> newSubs) {
        this.newSubs = newSubs;
    }
    
    
    
}
