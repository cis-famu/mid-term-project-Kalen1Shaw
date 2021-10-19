/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.endpoint;

import com.mycompany.twitchwebservice.model.service.StrSumService;
import com.mycompany.twitchwebservice.models.StreamSumm;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author kshaw
 */
@WebService
public class StreamSummary {
    
    private final StrSumService service;
    
    public StreamSummary(){
        this.service = new StrSumService();
    }
    
    @WebResult(name = "Stream Summaries")
    public List<StreamSumm> getAllSummaries() throws InterruptedException, ExecutionException{
        return service.all();
    }
    
    @WebResult(name = "Stream Summaries")
    public StreamSumm getSummbyUsers(String username) throws ExecutionException, InterruptedException{
        
        return service.findbyUsername(username);
    }
    
    @WebResult(name = "Stream Summaries")
    public StreamSumm getSummbyNoofViews(int numofViewers) throws InterruptedException, ExecutionException{
        
        return service.findbyNumofViewers(numofViewers);
    }
    
    
    
    
    
}
