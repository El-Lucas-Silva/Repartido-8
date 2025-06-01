package Ejercicio1;

public class Habitacion {

    private  int numero;
    private String tipo;
    private double precioBase;

    public Habitacion (int numero, double precioBase){
        this.numero = numero;
        this.tipo = "Indefinida";
        this.precioBase = precioBase;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+this.precioBase * dias);
    }

    public void mostrarDetalle(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio Base: " + this.precioBase);
    }
}
