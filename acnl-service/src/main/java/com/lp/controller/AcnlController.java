package com.lp.controller;

import com.lp.model.AcnlRequest;
import com.lp.model.AcnlResponse;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.security.InvalidParameterException;

@RestController
@RequestMapping("/acnl")
public class AcnlController {

    @GetMapping
    public String get() {
        System.out.println("Master greet 1);
        System.out.println("Master greet 2);
        System.out.println("Master greet 3);
        System.out.println("this is get request");
        return "Hello";
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public AcnlResponse post(@Validated @RequestBody AcnlRequest acnlRequest, @RequestHeader("key") String key) {
        System.out.println(acnlRequest);
        System.out.println("Key:" + key);
        if(acnlRequest.getClientId().equals("101")){
            throw new InvalidParameterException("Client Id 101 is reserved");
        }
        return new AcnlResponse("Pass", true, 101);
    }


}
