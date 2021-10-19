/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.twitchwebservice.model.service;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.mycompany.twitchwebservice.models.StreamSumm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 *
 * @author kshaw
 */
public class StrSumService extends DBConnection{
    
    public StrSumService(){
        
        super();
    }
    
    public StreamSumm findbyUsername (String username) throws InterruptedException, ExecutionException
    {
       //refernce to the collection(table)
	CollectionReference  po = db.collection("PurchaseOrder");
	//query where clause
	Query query = po.whereEqualTo("username", username);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(StreamSumm.class);

  
  return null;
    }
    
    public List<StreamSumm> all() throws InterruptedException, ExecutionException{
         List<StreamSumm> results = new ArrayList<>();
  
	// asynchronously retrieve all users
	ApiFuture<QuerySnapshot> query = db.collection("Stream Summaries").get();
	
	// query.get() blocks (stops other processes from excuting) on response 
	// call to firebase
	QuerySnapshot querySnapshot = query.get();
	
	//getting the result set 
	List<QueryDocumentSnapshot> documents = querySnapshot.getDocuments();
   
        //loop over result set and add them to list
        documents.forEach(document -> {
            results.add(document.toObject(StreamSumm.class));
        });
        return results;
    }
        
    public StreamSumm findbyNumofViewers(int numofViewers) throws InterruptedException, ExecutionException{
        
         //refernce to the collection(table)
	CollectionReference  po = db.collection("PurchaseOrder");
	//query where clause
	Query query = po.whereEqualTo("numofViewers", numofViewers);
	
	
	ApiFuture<QuerySnapshot> querySnapshot = query.get();
  
	List<QueryDocumentSnapshot> documents = querySnapshot.get().getDocuments();
	if(documents.size() == 1)
		return documents.get(0).toObject(StreamSumm.class);

  
  return null;
        
    }
    
}
