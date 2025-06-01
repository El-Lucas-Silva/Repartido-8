package Ejercicio3;

public class ADC extends Campeon {

    private int rango;

    public ADC (String nombre, int ataque, int defensa, int velocidad, int rango) {
        super(nombre, "ADC", ataque, defensa, velocidad);
        this.rango = rango;
    }

    //Metodos

    int atacar() {
        return super.atacar() + (rango / 4);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Rango: " + rango + " | ";
    }
}
