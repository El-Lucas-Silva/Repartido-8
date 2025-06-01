package Ejercicio3;

public class Campeon {

    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int salud;

    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = 100;
    }

    //Metodos

    int atacar(){
        return ((this.ataque + this.velocidad) / 2);
    }

    int ataqueEspecial(){
        return ((this.ataque + this.defensa) / 2);
    }

    void recibirDanio(int danio){
        if (this.salud <= 0){
            this.salud = 0;
        } else {
            this.salud -= danio;
        }
        System.out.println(this.nombre + " ha recibido "+ danio +" de daño | Salud: " + this.salud);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " | " +
                "Rol: " + rol + " | " +
                "Ataque: " + ataque + " | " +
                "Defensa: " + defensa + " | " +
                "Velocidad: " + velocidad + " | " +
                "Salud: " + salud + " | "
                ;
    }
}
