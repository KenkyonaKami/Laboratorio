package Laboratorio;

import java.util.ArrayList;

public class ListMedicamentos {
    
    private final ArrayList<Medicamento> medicamentos;

    public ListMedicamentos(){
        medicamentos = new ArrayList<>();
    }
    
    public void addMedicamento(Medicamento m){
        medicamentos.add(m);
    }

    public void removeMedicamento(int index){
        medicamentos.remove(index);
    }

    public ArrayList<Medicamento> getMedicamentos(){
        return medicamentos;
    }

}
