package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class AccountController {

@GetMapping("/cuentas-unicas")
   public String[] cuentasUnicas() {
       return cuentasNoRepetidas();
   }
 
   /**
    * Solo interesan las cuentas que aparezcan NO repetidas
    * @return
    */
   private String[] cuentasNoRepetidas() {

       return new String[]{"crédito", "hipotecaria", "amparada" };

   }


    private List<String> listaCuentas(){
        var unEjemplo=new ArrayList<String>();
        unEjemplo.add("ahorros");
        unEjemplo.add("crédito");
        unEjemplo.add("hipotecaria");
        unEjemplo.add("afp");
        unEjemplo.add("ahorros");
        unEjemplo.add("afp");
        unEjemplo.add("amparada");
        unEjemplo.add("ahorros");
        unEjemplo.add("vista");
        unEjemplo.add("afp");
        unEjemplo.add("vista");
        unEjemplo.add("ahorros");

        return unEjemplo;
    }
}
