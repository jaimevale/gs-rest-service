package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.stream.IntStream;

@RestController
public class HistogramController {
    String nl = "<br>";
    String full="&#9989;";
    String none="&#11093;";

    @GetMapping("/histograma")
    public String histograma(
            @RequestParam(value="valores", defaultValue = "1,2,3,2,3,3,3,5")  int[] values){

        StringBuilder resultado = new StringBuilder();
        resultado.append("1: ").append(full).append(nl); //una sola repeticion
        resultado.append("2: ").append(full).append(full).append(nl);
        resultado.append("3: ").append(full).append(full).append(full).append(full).append(nl); //4 veces
        resultado.append("4: ").append(none).append(nl);
        resultado.append("5: ").append(full).append(nl);
        System.out.println(resultado.toString());
        return resultado.toString();
    }
}
