/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.endpoint;

import com.mycompany.twitchwebservice.model.service.SubService;
import com.mycompany.twitchwebservice.models.Subs;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author kshaw
 */
@WebService
public class Subscriber {
    
    private final SubService service;
    
    public Subscriber(){
        this.service = new SubService();
    }
    
    @WebResult(name = "Subscribers")
    public List<Subs> getAllSubs () throws InterruptedException, ExecutionException{
        
        return service.all();
    }
    
     @WebResult(name = "Subscribers")
    public Subs getSubsbyUsers(String username) throws InterruptedException, ExecutionException{
        
        return service.findbyUsername(username);
    }
    
     @WebResult(name = "Subscribers")
    public Subs getSubsbyPayment(int payment) throws InterruptedException, ExecutionException{
        
        return service.findbyPayment(payment);
    }
    
    
}
