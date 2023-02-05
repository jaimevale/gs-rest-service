package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AltController {
    @GetMapping("/acumulador")
    public int[] acumuladorController(
            @RequestParam(value="valores", defaultValue = "5,2,3,2,3,3,3,1")  int[] values){

        return values;


    }





}
