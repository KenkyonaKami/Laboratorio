package Laboratorio;

public class Main{
    public static void main(String args[]){
        ListMedicamentos lm = new ListMedicamentos();
        DB.createArchive("Medicamentos.txt");
        boolean bandera;
        do{
            int opcion = Menu.elegirOpcion();
            System.out.println("=============================================\n");
            bandera = Menu.realizarOpcion(opcion, lm);
            System.out.println("=============================================");
        }while(bandera != false);
        System.out.println("=====LEYENDO LA BASE DE DATOS=====");
        DB.readArchive();

    }
}