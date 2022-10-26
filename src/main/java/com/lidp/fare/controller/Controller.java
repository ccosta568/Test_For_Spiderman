package com.lidp.fare.controller;

import com.lidp.fare.domain.Fare;
import com.lidp.fare.service.FareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public FareService fareService;
    public Iterable iterable;

    @GetMapping("/fare")
    public List<Fare> getFares(){
        return (List<Fare>) fareService.getFares();
    }
}
