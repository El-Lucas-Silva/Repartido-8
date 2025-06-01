package Ejercicio3;

public class Support extends Campeon {

    private int curacion;

    public Support (String nombre, int ataque, int defensa, int velocidad, int curacion) {
        super(nombre, "Support", ataque, defensa, velocidad);
        this.curacion = curacion;
    }

    //Metodos

    int ataqueEspecial() {
        if (this.salud >= 100) {
            this.salud = 100;
        } else {
            this.salud += this.curacion;
        }
        System.out.println(this.nombre + " regenero "+ this.curacion +" puntos de Salud | Salud: " + this.salud);
        return super.ataqueEspecial();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Curación: " + curacion + " | ";
    }
}
