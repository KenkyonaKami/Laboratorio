package Laboratorio;

import java.text.NumberFormat;

public class Format{

    public static String formatNumber(double numero){
        return NumberFormat.getCurrencyInstance().format(numero);
    }

}