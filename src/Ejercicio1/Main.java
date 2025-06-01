package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        HabitacionSuitePresidencial rHSP1 = new HabitacionSuitePresidencial(16, 20);
        HabitacionSuite rHS1 = new HabitacionSuite(13,20);
        HabitacionEstandar rHE = new HabitacionEstandar(15,20);

        System.out.println("==========================");
        rHSP1.calcularPrecioFinal(6);
        System.out.println("--------------------------");
        rHSP1.mostrarDetalle();
        System.out.println("==========================");
        rHS1.calcularPrecioFinal(6);
        System.out.println("--------------------------");
        rHS1.mostrarDetalle();
        System.out.println("==========================");
        rHE.calcularPrecioFinal(6);
        System.out.println("--------------------------");
        rHE.mostrarDetalle();
        System.out.println("==========================");
    }
}