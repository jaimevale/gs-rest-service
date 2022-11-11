package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Stream;

@RestController
public class MultWithoutBordersController {

    @GetMapping("/mult-no-borders")
    public static long multMinMax(@RequestParam(value = "list", defaultValue = "2,3,4,5,9") List<Integer> list) {
      // implementar la multiplicación de los enteros sin incluir ni el menor ni el mayor
        return multWithoutBorders(list.stream());

    }

    private static long multWithoutBorders(Stream<Integer> stream) {
        // Este codigo no es deseado porque no se pueden usar loops
        int max = 1;
        int min = 1_000_000;
        long mult = 1;
        var list = stream.toList();  //No usar esto en la respuesta. Se debe mantener como Stream
        for (int value : list) {
            max = Math.max(max, value);
            min = Math.min(min, value);
            mult *= value;
        }
        return mult / ((long) max * min);
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(2, 3, 4, 5, 9);

        assert 60L == multWithoutBorders(stream) : "No superó la prueba más simple";
    }
}
