package com.itforall.itforallam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.itforall.itforallam.model.AssetInventory;

public interface AssetInventoryRepository extends MongoRepository<AssetInventory, Long> {

    public AssetInventory findOneByAssetId(Long assetId);
	
}
