package com.example.springBootJpa.dao;

import com.example.springBootJpa.model.Alien;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {

}
