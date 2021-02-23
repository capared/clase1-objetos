package Clase2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha() {
        Date date = new Date();
        Calendar cal = new GregorianCalendar();

        this.dia = cal.get(Calendar.DATE);
        this.mes = cal.get(Calendar.MONTH);
        this.anio = cal.get(Calendar.YEAR);
    }
}
