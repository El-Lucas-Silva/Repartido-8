package Ejercicio1;

public class HabitacionSuitePresidencial extends Habitacion{

    public HabitacionSuitePresidencial(int numero, double precioBase){
        super(numero, precioBase);
        setTipo("Habitacion Suite Presidencial");
    }
    
    @Override
    public void calcularPrecioFinal(int dias){
        if (dias > 5){
            System.out.println("El precio final es: " + (getPrecioBase() * 1.5 * dias * 0.90));
        } else {
            System.out.println("El precio final es: " + getPrecioBase() * 1.5 * dias);
        }
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
}
