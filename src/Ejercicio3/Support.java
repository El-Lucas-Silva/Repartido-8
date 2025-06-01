package Ejercicio3;

public class Support extends Campeon {

    private int curacion;

    public Support (String nombre, int ataque, int defensa, int velocidad, int curacion) {
        super(nombre, "Support", ataque, defensa, velocidad);
        this.curacion = curacion;
    }

    //Metodos

    int ataqueEspecial() {
        if (getSalud() >= 100) {
            setSalud(100);
        } else {
            setSalud(getSalud() + this.curacion);
        }
        System.out.println(this.nombre +" utilizo un Ataque Especial! | Daño infringido: "+ super.ataqueEspecial());
        System.out.println(this.nombre + " regenero "+ this.curacion +" puntos de Salud | Salud: " + getSalud());
        return super.ataqueEspecial();
    }

    @Override
    public String toString() {
        return super.toString() +
                "Curación: " + curacion + " | ";
    }
}
