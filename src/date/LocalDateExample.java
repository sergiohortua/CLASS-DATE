/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import static java.time.DayOfWeek.TUESDAY;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import static java.time.temporal.TemporalAdjusters.next;

/**
 *
 * @author TOSHIBA
 */
public class LocalDateExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solo Fecha:
        LocalDate now, bDate, nowPlusMonth, nextTues;
        now = LocalDate.now();
        System.out.println("Ahora: " + now);
        bDate = LocalDate.of(1995, 5, 23);
        System.out.println("Nacimineto de java: " + bDate);
        System.out.println("El nacimiento de java fue en el pasado? " + bDate.isBefore(now));
        System.out.println("El año en el que nacio java era biciesto: " + bDate.isLeapYear());//año biciesto
        System.out.println("Que dia de la semana nacio java: " + bDate.getDayOfWeek());

        nowPlusMonth = now.plusMonths(2);
        System.out.println("Despues de sumarle 2 meses al now" + nowPlusMonth);

        nextTues = now.with(next(TUESDAY));
        System.out.println("Hoy es: " + now + "\nEl proximo martes es: " + nextTues);
        
        System.out.println("==========");
        LocalDate myDate = LocalDate.now();
        JapaneseDate jDate = JapaneseDate.from(myDate);
        System.out.println("Fecha en japon de hoy: " + jDate);
        System.out.println("==========");
        

    }

}
