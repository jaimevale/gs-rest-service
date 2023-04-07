package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
public class AccountController {
    /**
     * Solo interesan las cuentas que aparezcan NO repetidas
     *
     * @return lista de los tipos de cuentas no repetidos
     */
    @GetMapping("/cuentas-unicas")
    public String[] cuentasUnicas() {
        return new String[]{"crédito", "hipotecaria", "amparada"};
// No se pide un distinct , se piden los tipos de cuentas no repetidos
    }

    @GetMapping("/saldo-acumulado")
    public Map<String, String> saldo() {
      Map<String, String> map = Map.of("hipotecaria", "COP400,000.00",
                "crédito", "COP200,000.00",
                "afp", "COP1,200,000.00",
                "ahorros", "COP2,600,000.00",
                "vista", "COP1,100,000.00",
                "amparada", "COP500,000.00");

      return map;
    }

    private Stream<Cuenta> listaCuentas() {
        var unEjemplo = new ArrayList<Cuenta>();
        unEjemplo.add(new Cuenta("ahorros", 1, 100_000));
        unEjemplo.add(new Cuenta("crédito", 2, 200_000));
        unEjemplo.add(new Cuenta("afp", 3, 300_000));
        unEjemplo.add(new Cuenta("ahorros", 4, 300_000));
        unEjemplo.add(new Cuenta("hipotecaria", 5, 400_000));
        unEjemplo.add(new Cuenta("afp", 6, 400_000));
        unEjemplo.add(new Cuenta("amparada", 7, 500_000));
        unEjemplo.add(new Cuenta("ahorros", 8, 500_000));
        unEjemplo.add(new Cuenta("vista", 9, 500_000));
        unEjemplo.add(new Cuenta("afp", 10, 500_000));
        unEjemplo.add(new Cuenta("vista", 11, 600_000));
        unEjemplo.add(new Cuenta("ahorros", 12, 1_700_000));

        return unEjemplo.stream();
    }
}

record Cuenta(String tipo,
              int id,
              double saldo
) {
}

