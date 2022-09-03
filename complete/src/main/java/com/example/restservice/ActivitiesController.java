package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.stream.Stream;

@RestController
public class ActivitiesController {

    /**
     * entrega el Stream con las fechas de las actividades en ese año
     *  *
     * @param year el año para el que se quieren los 12 meses
     * @param week semana es un numero de 1 a 4
     * @param dayOfWeek nombre del dia como String. Se utilizará DayOfWeek.valueOf(string)
     * @return un stream de doce localDate
     */
    @GetMapping("/actividades")
    public Stream<LocalDate> actividadesAsStream(
            @RequestParam(value="year", defaultValue = "2022")  int year,
            @RequestParam(value="week", defaultValue = "2")     int week,
            @RequestParam(value="day", defaultValue = "FRIDAY") DayOfWeek dayOfWeek){

        return Arrays.stream(new LocalDate[]{
                LocalDate.of(year, Month.JANUARY,   14),
                LocalDate.of(year, Month.FEBRUARY,  11),
                LocalDate.of(year, Month.MARCH,     11),
                LocalDate.of(year, Month.APRIL,     8),
                LocalDate.of(year, Month.MAY,       13),
                LocalDate.of(year, Month.JUNE,      10),
                LocalDate.of(year, Month.JULY,      8),
                LocalDate.of(year, Month.AUGUST,    12),
                LocalDate.of(year, Month.SEPTEMBER, 9),
                LocalDate.of(year, Month.OCTOBER,   14),
                LocalDate.of(year, Month.NOVEMBER,  11),
                LocalDate.of(year, Month.DECEMBER,  9),
        });
    }
}
