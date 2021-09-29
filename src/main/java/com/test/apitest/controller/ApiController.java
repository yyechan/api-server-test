package com.test.apitest.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http:localhost:3000")
public class ApiController {

    @GetMapping(path = "/")
    public String getApiTest(){
        return "hi";
    }
}
