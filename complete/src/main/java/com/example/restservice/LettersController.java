package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LettersController {

    @GetMapping("/letras")
    public String[] actividadesAsStream(
        @RequestParam(value="palabra", defaultValue = "sol")  String palabra){
            return new String[]{"sol","som","spl","spm","tol","tom","tpl","tpm"};
    }
}
