package Ejercicio1;

public class HabitacionEstandar extends Habitacion{

    private String tipo;

    public HabitacionEstandar (int numero, double precioBase){
        super(numero, precioBase);
        setTipo("Habitacion Estandar");
    }

    @Override
    public void calcularPrecioFinal(int dias){
        System.out.println("El precio final es: "+getPrecioBase() * dias);
    }

    @Override
    public void mostrarDetalle() {
        super.mostrarDetalle();
    }
}
