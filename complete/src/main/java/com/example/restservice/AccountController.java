package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
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
       // entregar solo las cuentas NO repetidas
       //  Evitar soluciones con complejidad O(n^2)
       var cuentas = listaCuentas();
       String[] repetidas = new String[cuentas.size()];
 
       for (int i = 0; i < cuentas.size(); i++) {
           for (int j = 1; j < cuentas.size(); j++) {
               if(cuentas.get(i) == cuentas.get(j)){
                   repetidas[i] = cuentas.get(i);
               }
           }
       }
       return repetidas;
   }
 
 
   private List<String> listaCuentas(){
       String[] unEjemplo = new String[] { 
               "ahorros", "credito", "hipotecaria", "afp", "ahorros", "vista",
               "ahorros", "kids", "amparada", "afp", "blue", "vista", "blue"
       };
       return Arrays.asList(unEjemplo);
   }
}
