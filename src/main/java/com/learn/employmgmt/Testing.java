package com.learn.employmgmt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Testing {

    @GetMapping("/hai")
    public String getMessage(){
        return "getMessage() method from Testing Classes";
    }

}
