package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.IntStream;

@RestController
public class HistogramController {
    String linea = "<br>"; 
    String voto="&#9989;";
    String cero="&#11093;";

    @GetMapping("/histograma")
    public String histograma(
            @RequestParam(value="valores", defaultValue = "5,2,3,2,3,3,3,1")  int[] values){

        StringBuilder resultado = new StringBuilder();
        resultado.append("1: ").append(voto).append(linea); //una sola repeticion
        resultado.append("2: ").append(voto).append(voto).append(linea);
        resultado.append("3: ").append(voto).append(voto).append(voto).append(voto).append(linea); //4 veces
        resultado.append("4: ").append(cero).append(linea);
        resultado.append("5: ").append(voto).append(linea);
        System.out.println(resultado.toString());
        return resultado.toString();
    }
}
