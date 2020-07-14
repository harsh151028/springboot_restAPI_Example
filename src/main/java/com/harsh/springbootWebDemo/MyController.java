package com.harsh.springbootWebDemo;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class MyController {

    @GetMapping("/hi")
    public String sayHey(){

    return "hello fork!";
    }

    @PostMapping("/wish")
    public String wishByName(@RequestBody Map names) {

        return "Happy Birthday !! Dear "+names.get("name");
    }
}
