package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

record Cuenta(  String tipo, 
                int id,
                double saldo
                ) {}


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


    private List<Cuenta> listaCuentas(){
        var unEjemplo=new ArrayList<Cuenta>();
        unEjemplo.add(new Cuenta("ahorros",    1,   100_000));
        unEjemplo.add(new Cuenta("crédito",    2,   200_000));
        unEjemplo.add(new Cuenta("afp",        3,   300_000));
        unEjemplo.add(new Cuenta("ahorros",    4,   300_000));
        unEjemplo.add(new Cuenta("hipotecaria",5,   400_000));
        unEjemplo.add(new Cuenta("afp",        6,   400_000));
        unEjemplo.add(new Cuenta("amparada",   7,   500_000));
        unEjemplo.add(new Cuenta("ahorros",    8,   500_000));
        unEjemplo.add(new Cuenta("vista",      9,   500_000));
        unEjemplo.add(new Cuenta("afp",       10,   500_000));
        unEjemplo.add(new Cuenta("vista",     11,   600_000));
        unEjemplo.add(new Cuenta("ahorros",   12, 1_700_000));

        return unEjemplo;
    }
}
