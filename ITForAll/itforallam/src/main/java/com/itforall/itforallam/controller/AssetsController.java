package com.itforall.itforallam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itforall.itforallam.model.Assets;
import com.itforall.itforallam.repository.AssetsRepository;


@RestController
@RequestMapping("/assets")
public class AssetsController {

    @Autowired
    AssetsRepository assetsRepository;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Assets asset) {
    	assetsRepository.save(asset);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) 
    public Assets read(@PathVariable Long id) {
        return assetsRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Assets asset) {
    	assetsRepository.save(asset);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable Long id) {
    	assetsRepository.delete(id);
    }

}
