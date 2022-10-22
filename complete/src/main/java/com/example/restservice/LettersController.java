package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LettersController {

    @GetMapping("/letras")
    public String[] actividadesAsStream(
        @RequestParam(value="palabra", defaultValue = "am")  String palabra){
            return new String[]{"am","an","bm","bn"};
    }
}
