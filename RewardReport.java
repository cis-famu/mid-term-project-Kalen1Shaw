/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.endpoint;

import com.mycompany.twitchwebservice.model.service.RewardService;
import com.mycompany.twitchwebservice.models.Rewards;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author kshaw
 */
@WebService
public class RewardReport {
    
    private final RewardService service;
    
    public RewardReport(){
        this.service = new RewardService();
    }
    
    @WebMethod
    @WebResult(name= "Rewards")
    public List<Rewards> getAllRewards() throws InterruptedException, ExecutionException{
        
        return service.all();
    }
    
    @WebResult(name = "Rewards")
    public Rewards getRewardsbyUser( String username) throws InterruptedException, ExecutionException{
        
        return service.findbyUsername(username);
    }
    
    @WebResult(name = "Rewards")
    public Rewards getRewardsbyName(String rewName) throws InterruptedException, ExecutionException{
        
        return service.findbyRewardName(rewName);
    }
    
}
