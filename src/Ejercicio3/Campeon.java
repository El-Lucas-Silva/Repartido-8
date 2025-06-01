package Ejercicio3;

public class Campeon {

    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    private int salud;

    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad) {
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.salud = 100;
    }

    //Metodos

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    int atacar(){
        System.out.println(this.nombre +" Ataca! | Daño infringido: "+ (this.ataque + this.velocidad) / 2);
        return ((this.ataque + this.velocidad) / 2);
    }

    int ataqueEspecial(){
        System.out.println(this.nombre +" utilizo un Ataque Especial! | Daño infringido: "+ (this.ataque + this.defensa) / 2);
        return ((this.ataque + this.defensa) / 2);
    }

    void recibirDanio(int danio){
        if (this.salud <= 0){
            this.salud = 0;
            System.out.println(this.nombre +"ha sido eliminado.");
        } else {
            this.salud -= danio;
            if (this.salud <= 0){
                this.salud = 0;
            }
            System.out.println(this.nombre + " ha recibido "+ danio +" de daño | Salud: " + this.salud);
        }
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
