package com.itforall.itforallam.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.itforall.itforallam.model.Employees;


public interface EmployeesRepository extends MongoRepository<Employees, Long> {

    public Employees findOneByName(String name);

}