package Clase2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args){
        CuentaCorriente cuenta1 = new CuentaCorriente();
        System.out.println("Valor de la cuenta: " + cuenta1.getSaldo());

        CuentaCorriente cuenta2 = new CuentaCorriente(200);
        System.out.println("Valor de la cuenta: " + cuenta2.getSaldo());

        Libro libro = new Libro();
        System.out.println(libro);

        Fraccion fraccion1 = new Fraccion(2,5);
        System.out.println(fraccion1);

        Fraccion fraccion2 = new Fraccion(2, 5);

        fraccion1.sumar(3);
        System.out.println(fraccion1);

        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        System.out.println(cal.get(Calendar.DATE));

    }
}
