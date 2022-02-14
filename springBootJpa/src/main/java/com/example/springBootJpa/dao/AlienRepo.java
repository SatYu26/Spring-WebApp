package com.example.springBootJpa.dao;

import java.util.List;

import com.example.springBootJpa.model.Alien;

import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
    List<Alien> findByTech(String tech);

    List<Alien> findByAidGreaterThan(int aid);
}
