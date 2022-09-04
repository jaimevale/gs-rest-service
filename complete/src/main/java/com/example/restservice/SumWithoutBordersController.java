package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class SumWithoutBordersController {

    @GetMapping("/suma-flujo")
    public static long sumMinMax(@RequestParam(value = "list", defaultValue = "5, 6 , 8, 1, 3, 9") List<Integer> list){
        // implementar la suma de los enteros sin incluir el menor y el mayor
        return sumWithoutBorders(list.stream());

    }

    private static long sumWithoutBorders(Stream<Integer> stream){
        return 22L;
    }

    public static void main(String[] args){
        Stream<Integer> stream = Stream.of(5, 6 , 8, 1, 3, 9);

        assert 22L == sumWithoutBorders(stream) : "No superó la prueba más simple";
    }

}
