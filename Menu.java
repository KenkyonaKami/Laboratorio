package Laboratorio;

import java.util.Scanner;

public class Menu {
    
    static Scanner sc;

    public static int elegirOpcion(){
        
        sc = new Scanner(System.in);

        System.out.println("=========MENU MIFARMA==========");
        System.out.println("1)Registar medicamento.");
        System.out.println("2)Mostrar medicamentos.");
        System.out.println("3)Buscar medicamento.");
        System.out.println("4)Eliminar medicamento.");
        System.out.println("5)Ordenar medicamentos.");
        System.out.println("6)Salir.");

        int opcion = Valid.getInt(sc, "Digite su opcion: ", 1, 6);
        
        return opcion;
    }

    public static boolean realizarOpcion(int opcion , ListMedicamentos lm){
        boolean bandera = true;
        switch(opcion){
            case 1 : OperacionesLabo.registroMedicamento(sc, lm);
                     System.out.println("\n");
                    break;
            case 2: OperacionesLabo.mostrarMedicamentos(lm);
                    System.out.println("\n");
                    break;
            case 3: OperacionesLabo.buscarMedicamento(sc, lm);
                    System.out.println("\n");
                    break;
            case 4: OperacionesLabo.eliminarMedicamento(sc, lm);
                    System.out.println("\n");
                    break;
            case 5: OperacionesLabo.ordenarMedicamentos(lm);
                    System.out.println("\n");
                    break;
            case 6: System.out.println("MODIFICACIONES REALIZADAS CON EXITO.");
                    bandera = false;
                    DB.writeArchive(lm);
                    break;
        }
        return bandera;
    }
    
}
