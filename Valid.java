package Laboratorio;

import java.util.Scanner;

public class Valid {
    public static int getInt(Scanner sc, String prompt){
        int i = 0 ;
        boolean isValid = false;
        while (isValid == false){
            System.out.print(prompt);
            if (sc.hasNextInt()){
                i = sc.nextInt();
                isValid = true;
            } else System.out.println("Error! Valor entero no válido. Intente de nuevo.");
            sc.nextLine();
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt, int min, int max){
        int i = 0;
        boolean isValid = false;
        while (isValid == false){
            i = getInt(sc, prompt);
            if (i <= max && i >= min ) {
                isValid = true;
            }
            else{
                System.out.println("Error!Opcion no valida");
            } 
        }
            return i ;
    }
}
