package com.itforall.itforallam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itforall.itforallam.model.AssetInventory;
import com.itforall.itforallam.repository.AssetInventoryRepository;

@RestController
@RequestMapping("/assetInventory")
public class AssetInventoryController {

	 	@Autowired
	    AssetInventoryRepository assetInventoryRepository;

	    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody AssetInventory assetInventory) {
	    	assetInventoryRepository.save(assetInventory);
	    }

	    @RequestMapping(value = "/{assetId}", method = RequestMethod.GET) 
	    public AssetInventory read(@PathVariable Long assetId) {
	    	AssetInventory assetInventory = assetInventoryRepository.findOneByAssetId(assetId);
	    	if(assetInventory.getTotalAssetCount() == 0) {
	    		
	    	}
	        return assetInventory;
	    }

//	    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//	    public void update(@RequestBody AssetInventory assetInventory) {
//	    	assetInventoryRepository.save(assetInventory);
//	    }

//	    @RequestMapping(value = "/{assetInventoryId}", method = RequestMethod.DELETE) 
//	    public void delete(@PathVariable Long assetInventoryId) {
//	    	assetInventoryRepository.delete(assetInventoryId);
//	    }

}