/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import static java.time.Month.MARCH;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.HOURS;

/**
 *
 * @author TOSHIBA
 */
public class FechaTiempoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LocalDateTime meeting, fligth, courseStar, courseEnd;

        meeting = LocalDate.of(2014, Month.MARCH, 21).atTime(8, 26);
        System.out.println("Fecha: " + meeting);

        LocalDate fligthDay = LocalDate.of(2014, 3, 31);
        LocalTime fligthTime = LocalTime.of(21, 45);

        fligth = LocalDateTime.of(fligthDay, fligthTime);
        System.out.println("El vuelo es en la siguiente fecha: " + fligth);

        courseStar = LocalDateTime.of(2014, Month.MARCH, 24, 9, 00);
        courseEnd = courseStar.plusDays(4).plusHours(8);
        System.out.println("Inicio del curso: " + courseStar);
        System.out.println("Fin del curso: " + courseEnd);
        
        long totalHrs = (courseEnd.getHour() - courseStar.getHour()) * (courseStar.until(courseEnd, DAYS) );
        System.out.println(" " + courseEnd.getHour());// 17?
        System.out.println(" " + courseStar.getHour());// 9?
        System.out.println(" " + courseStar.until(courseEnd, DAYS));// 4?
        System.out.println("=====\nTotal de horas del curso: " + totalHrs);
        
        

    }

}
