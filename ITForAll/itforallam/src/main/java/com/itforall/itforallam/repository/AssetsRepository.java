package com.itforall.itforallam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itforall.itforallam.model.Assets;

public interface AssetsRepository extends MongoRepository<Assets, Long> {

    public Assets findOneByName(String name);
}
