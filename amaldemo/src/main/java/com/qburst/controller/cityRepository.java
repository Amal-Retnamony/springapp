package com.qburst.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface cityRepository extends CrudRepository<city, Long> {

    List<city> findAll();
}
