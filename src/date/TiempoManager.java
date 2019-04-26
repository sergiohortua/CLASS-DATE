/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package date;

import java.time.LocalTime;
//import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.HOURS;
import static java.time.temporal.ChronoUnit.MINUTES;

/**
 *
 * @author TOSHIBA
 */
public class TiempoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LocalTime now, nowPlus, nowHrsMins, lunch, bedtime;

        now = LocalTime.now();
        System.out.println("El tiempo de ahora es: " + now);

        nowPlus = now.plusHours(1).plusMinutes(15);
        System.out.println("Despues de sumarle 1:15 es: " + nowPlus);
        System.out.println("=====");
        System.out.println((now.getHour() - 1) + ":" + (now.getMinute() - 15) + ":" + (now.getSecond()) + ".");//le reste con los get 1 hora y 15 minutos
        System.out.println("=====");
        System.out.println("En que minuto del dia vamos: " + now.toSecondOfDay() / 60);//Da el segundo del dia en cual vamos, para saber el minuto en el que vamos dividimos el metodo entre 60

        lunch = LocalTime.of(22, 0);
        System.out.println("Mi almuerzo es en el futuro: " + lunch.isAfter(now));
        long minsToLunch = now.until(lunch, MINUTES);
        System.out.println("Falta:" + minsToLunch + " minutos para almorzar");

        bedtime = LocalTime.of(23, 0);
        long hrsToBedtime= now.until(bedtime, HOURS);
        System.out.println("Faltan "+hrsToBedtime+ " horas, para dormir");
        

    }

}
