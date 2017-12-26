package com.itforall.itforallam.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itforall.itforallam.model.AssetRequests;
import com.itforall.itforallam.repository.AssetInventoryRepository;
import com.itforall.itforallam.repository.AssetRequestsRepository;
import com.itforall.itforallam.service.AssetService;


@RestController
@RequestMapping("/assetRequests")
public class AssetRequestsController {

    @Autowired
    AssetRequestsRepository assetRequestsRepository;
	@Autowired
    AssetInventoryRepository assetInventoryRepository;
	@Autowired
    AssetService assetService;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody AssetRequests assetRequest) {
    	assetService.createAssetRequest(assetRequest);
    	//assetRequestsRepository.save(assetRequest);
    }

    @RequestMapping(value = "/{requestId}", method = RequestMethod.GET) 
    public AssetRequests read(@PathVariable Long requestId) {
    	AssetRequests assetRequest = assetRequestsRepository.findOne(requestId);
    	Date currDate = new Date(System.currentTimeMillis());
    	Date expFulfilmentDate = assetRequest.getExpFulfilmentDate();
    	if(expFulfilmentDate != null) {
    		if(expFulfilmentDate.getTime() <= currDate.getTime()) {
    			assetRequest.setFulfilmentDate(expFulfilmentDate);
    			assetRequest.setRequestStatus("Processed");
    			assetRequestsRepository.save(assetRequest);
    		}
    	}
        return assetRequest;
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody AssetRequests assetRequest) {
    	assetRequestsRepository.save(assetRequest);
    }

//    @RequestMapping(value = "/{requestId}", method = RequestMethod.DELETE) 
//    public void delete(@PathVariable Long requestId) {
//    	assetRequestsRepository.delete(requestId);
//    }

}
