/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.endpoint;

import com.mycompany.twitchwebservice.model.service.AccountService;
import com.mycompany.twitchwebservice.models.Profile;
import java.util.concurrent.ExecutionException;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author kshaw
 */
@WebService
public class NAccount {
    
    private final AccountService service;
    
    public NAccount(){
        this.service = new AccountService();
    }
    
    @WebResult(name = "Accounts")
    public Profile getAccountbyUser(String username) throws InterruptedException, ExecutionException{
        return service.findbyUsername(username);
        
    }
    
    @WebResult(name = "Accounts")
    public Profile getAccountbyEmail(String email) throws InterruptedException, ExecutionException{
        return service.findbyEmail(email);
    }
    
}
