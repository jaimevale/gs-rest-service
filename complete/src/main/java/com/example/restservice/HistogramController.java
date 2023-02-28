package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class HistogramController {
    final String NLINEA = "<br>";
    final String VOTO="&#9989;";
    final String CERO="&#11093;";

    public String histograma(
            @RequestParam(value="valores", defaultValue = "1,2,3,2,3,3,3,5")  int[] values){

        StringBuilder resultado = new StringBuilder();
        resultado.append("1: ").append(VOTO).append(NLINEA); //una sola repeticion
        resultado.append("2: ").append(VOTO).append(VOTO).append(NLINEA);
        resultado.append("3: ").append(VOTO).append(VOTO).append(VOTO).append(VOTO).append(NLINEA); //4 veces
        resultado.append("4: ").append(CERO).append(NLINEA);
        resultado.append("5: ").append(VOTO).append(NLINEA);
        return resultado.toString();
    }
}