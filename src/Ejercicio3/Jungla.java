package Ejercicio3;

public class Jungla extends Campeon {

    private int controlMapa;

    public Jungla (String nombre, int ataque, int defensa, int velocidad, int controlMapa) {
        super(nombre, "Jungla", ataque, defensa, velocidad);
        this.controlMapa = controlMapa;
    }

    //Metodos

    int ataqueEspecial() {
        return super.ataqueEspecial() + (controlMapa / 5);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Resistencia: " + controlMapa + " | ";
    }
}
