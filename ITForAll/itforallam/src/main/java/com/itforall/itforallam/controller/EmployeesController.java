package com.itforall.itforallam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itforall.itforallam.model.Employees;
import com.itforall.itforallam.repository.EmployeesRepository;


@RestController
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    EmployeesRepository employeesRepository;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Employees employee) {
    	employeesRepository.save(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET) 
    public Employees read(@PathVariable Long id) {
        return employeesRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Employees employee) {
    	employeesRepository.save(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable Long id) {
    	employeesRepository.delete(id);
    }

}
