package Ejercicio3;

public class TopLaner extends Campeon {

    private int resistencia;

    public TopLaner(String nombre, int ataque, int defensa, int velocidad, int resistencia) {
        super(nombre, "Top Laner", ataque, defensa, velocidad);
        this.resistencia = resistencia;
    }

    //Metodos

    void recibirDanio(int danio) {
        int danioFinal = danio - (this.resistencia / 10);

        if (danioFinal <= 0) {
            System.out.println(this.nombre + " recibio un ataque tan debil que su salud no bajo | Salud: " + getSalud());
        } else if (getSalud() <= 0) {
            setSalud(0);
            System.out.println(this.nombre +"ha sido eliminado.");
        } else {
            setSalud(getSalud() - danioFinal);
            if (getSalud() <= 0){
                setSalud(0);
            }
            System.out.println(this.nombre + " ha recibido "+ danioFinal +" de daño | Salud: " + getSalud());
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Resistencia: " + resistencia + " | ";
    }
}
