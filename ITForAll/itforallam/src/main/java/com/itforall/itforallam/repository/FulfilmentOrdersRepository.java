package com.itforall.itforallam.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itforall.itforallam.model.FulfilmentOrders;


public interface FulfilmentOrdersRepository extends MongoRepository<FulfilmentOrders, Long> {

    public FulfilmentOrders findOneByAssetId(Long assetId);
    public List<FulfilmentOrders> findByAssetId(Long assetId);

}