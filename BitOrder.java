/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.endpoint;

import com.mycompany.twitchwebservice.model.service.BitServ;
import com.mycompany.twitchwebservice.models.Bits;
import java.util.concurrent.ExecutionException;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author kshaw
 */

@WebService
public class BitOrder {
    
    private final BitServ service;
    
    public BitOrder(){
        this.service = new BitServ();
    }
    
    @WebResult(name = "Users Sent")
    public Bits getBitsbyUser(@WebParam(name = "Users Bits Sent From") String username) throws InterruptedException, ExecutionException{
        return service.findbyUsername(username);
    }
    
    @WebResult(name = "Streamers Received")
    public Bits getBitsbyStreamerSubbed(@WebParam(name = "Streamers Bits Sent To") String streamer) throws InterruptedException, ExecutionException{
        
        return service.findbyStreamerSubbed2(streamer);
    }
    
    
}
