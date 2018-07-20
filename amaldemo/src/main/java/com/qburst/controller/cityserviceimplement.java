package com.qburst.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cityserviceimplement  implements cityservice {


    @Autowired
    cityRepository cityRepo;

    @Override
    public List<city> find() {
        List<city> cities = (List<city>)cityRepo.findAll();
        return cities;
    }
}
