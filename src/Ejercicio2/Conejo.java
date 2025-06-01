package Ejercicio2;

public class Conejo extends Animal{

    private double peso;

    public Conejo(String nombre, int edad, double peso) {
        super(nombre, edad, "Conejo");
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", peso='" + peso + '\'' +
                '}';
    }


}
