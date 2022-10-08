package Laboratorio;

public class Medicamento implements Comparable<Medicamento>{

    private String codigo;
    private String nombre;
    private int cantidad;
    private double precioUnitario;

    public Medicamento(String codigo , String nombre , double precioUnitario){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getCodigo(){
        return codigo;
    }
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public int getCantidad(){
        return cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario(){
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public String calculoMonto(){
        return Format.formatNumber(cantidad*precioUnitario);
    }

    @Override
    public String toString(){
        return "Codigo: " + this.getCodigo() + "\n" + 
               "Nombre: " + this.getNombre() + "\n" +
               "Cantidad: " + this.getCantidad() + "\n" +
               "Precio/Unidad : " + this.getPrecioUnitario() + "\n" +
               "Total: " + this.calculoMonto();
    }

    @Override
    public int compareTo(Medicamento m){
        return this.nombre.compareTo(m.getNombre());
    }
}