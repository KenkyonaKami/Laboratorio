package Laboratorio;

import java.util.Collections;
import java.util.Scanner;

public class OperacionesLabo {
    public static void registroMedicamento(Scanner sc , ListMedicamentos lm){
        
        System.out.print("Codigo: ");   
        String codigo = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Cantidad: ");
        int cantidad = sc.nextInt();

        System.out.print("Precio: ");
        double precio = sc.nextDouble();

        Medicamento m = new Medicamento(codigo, nombre, precio);
        m.setCantidad(cantidad);
        lm.addMedicamento(m);
    }

    public static void mostrarMedicamentos(ListMedicamentos lm){
        for(Medicamento m : lm.getMedicamentos()){
            System.out.println(m.toString());
        }
    }

    public static void buscarMedicamento(Scanner sc , ListMedicamentos lm){
        System.out.print("Codigo medicamento: ");
        String codigo = sc.nextLine();

        for(Medicamento m : lm.getMedicamentos()){
            if(m.getCodigo().equals(codigo)){
                System.out.println(m.toString());
                break;
            }
        }
    }

    public static void eliminarMedicamento(Scanner sc , ListMedicamentos lm){
        System.out.print("Codigo medicamento: ");
        String codigo = sc.nextLine();

        for(Medicamento m : lm.getMedicamentos()){
            if(m.getCodigo().equals(codigo)){
                int index = lm.getMedicamentos().indexOf(m);
                lm.removeMedicamento(index);
                break;
            }
        }

    }

    public static void ordenarMedicamentos(ListMedicamentos lm){
        Collections.sort(lm.getMedicamentos());

        for(Medicamento m : lm.getMedicamentos()){
            System.out.println(m.toString());
        }
    }
}
