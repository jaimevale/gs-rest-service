package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class AltController {
    @GetMapping("/acumulador")
    public int[] acumuladorController(
            @RequestParam(value="valores", defaultValue = "5,2,3,2,3,3,3,1")  int[] values){
        return values;
    }


    @GetMapping("/repeticiones")
    public Map.Entry<Integer, Integer> repeticiones(
            @RequestParam(value="valores", defaultValue = "5,5,1,2,2,3,4,5,6,6,6,6")  int[] values){
        return Map.entry(6,4);
    }




}
