package Ejercicio3;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        equipo1[0] = new TopLaner("Garen", 50, 60, 40, 30);
        equipo1[1] = new MidLaner("Ahari",  45, 50, 60, 40);
        equipo1[2] = new ADC("Jinx",  60, 60, 55, 25);

        equipo2[0] = new Jungla("Lee Sin",  65, 60, 65, 45);
        equipo2[1] = new Support("Tresh",  40, 80, 30, 50);
        equipo2[2] = new MidLaner("Lux",  55, 55, 60, 38);

        System.out.println("============================================================");
        System.out.println("EQUIPO 1:");
        for (Campeon c : equipo1) System.out.println(c);
        System.out.println("============================================================");
        System.out.println("EQUIPO 2:");
        for (Campeon c : equipo2) System.out.println(c);
        System.out.println("+==========================================================+");
        System.out.println("|                  ¡LA BATALLA COMENZO!                    |");
        System.out.println("+==========================================================+");
        System.out.println();
        System.out.println("------------------------------------------------------------");

        //Batalla
        while (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
            // Turno del equipo 1
            if (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
                Campeon atacante = obtenerVivoAleatorio(equipo1, rand);
                Campeon defensor = obtenerVivoAleatorio(equipo2, rand);

                int danio = rand.nextBoolean() ? atacante.ataqueEspecial() : atacante.atacar();
                defensor.recibirDanio(danio);
                System.out.println("------------------------------------------------------------");
            }

            // Turno del equipo 2
            if (equipoSigueVivo(equipo1) && equipoSigueVivo(equipo2)) {
                Campeon atacante = obtenerVivoAleatorio(equipo2, rand);
                Campeon defensor = obtenerVivoAleatorio(equipo1, rand);

                int danio = rand.nextBoolean() ? atacante.ataqueEspecial() : atacante.atacar();
                defensor.recibirDanio(danio);
                System.out.println("------------------------------------------------------------");
            }
        }

        // Resultados de la pelea
        if (equipoSigueVivo(equipo1)) {
            System.out.println("+-----------------------+");
            System.out.println("|¡El EQUIPO 1 ha ganado!|");
            System.out.println("+-----------------------+");
        } else {
            System.out.println("+-----------------------+");
            System.out.println("|¡El EQUIPO 2 ha ganado!|");
            System.out.println("+-----------------------+");
        }
    }

    //Funciones

    //Devuelve true si al menos un integrante tiene salud > 0
    public static boolean equipoSigueVivo(Campeon[] equipo) {
        boolean vivo = false;
        for (int i = 0 ; i < equipo.length ; i++){
            if (equipo[i].getSalud() > 0) {
                vivo = true;
            }
        }
        if (vivo){ return true; } else { return false; }
    }

    //Devuelve un campeon vivo seleccionado al azar
    public static Campeon obtenerVivoAleatorio (Campeon[] equipo, Random rand) {
        int vivos  = 0;
        for (Campeon c : equipo){
            if (c.getSalud() > 0){
                vivos++;
            }
        }
        if (vivos == 0) {
            return null;
        }
        int randomPlayer = rand.nextInt(vivos);
        int cont = 0;
        for (Campeon c : equipo){
            if (c.getSalud() > 0){
                if (cont == randomPlayer) {
                    return c;
                }
                cont++;
            }
        }
        return null;
    }
}
