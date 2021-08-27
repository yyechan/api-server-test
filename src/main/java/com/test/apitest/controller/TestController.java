package com.test.apitest.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping(value ="/api/test")
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest(@RequestHeader(value="User-Agent") String userAgent){
        return "your computer : " + userAgent;
    }


}
