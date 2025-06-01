package Ejercicio1;

public class HabitacionSuite extends Habitacion{

    private String tipo;

    public HabitacionSuite (int numero, double precioBase){
        super(numero, precioBase);
        setTipo("Habitacion Suite");
    }

    @Override
    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+getPrecioBase() * 1.2 * dias);
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
}
