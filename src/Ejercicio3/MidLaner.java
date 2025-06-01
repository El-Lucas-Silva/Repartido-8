package Ejercicio3;

public class MidLaner extends Campeon {

    private int poderMagico;

    public MidLaner (String nombre, int ataque, int defensa, int velocidad, int poderMagico) {
        super(nombre, "Mid Laner", ataque, defensa + (poderMagico / 2), velocidad);
        this.poderMagico = poderMagico;
    }

    //Metodos

    @Override
    void recibirDanio(int danio) {
        int danioFinal = danio - (this.poderMagico / 10);

        if (danioFinal <= 0) {
            System.out.println(this.nombre + " Recibio un ataque tan debil que su salud no bajo | Salud: " + this.salud);
        } else if (this.salud <= 0) {
            this.salud = 0;
        } else {
            this.salud -= danioFinal;
        }
        System.out.println(this.nombre + " ha recibido "+ danioFinal +" de daño | Salud: " + this.salud);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Poder Magico: " + poderMagico + " | ";
    }
}

