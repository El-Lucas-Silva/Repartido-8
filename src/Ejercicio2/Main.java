package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Conejo c1 = new Conejo("Papu", 12, 2.0);
        Perro p1 = new Perro("Princesa", 6, "Labrador");
        Gato g1 = new Gato("Biscocho", 4, "Naranja");
        Animal a1 = new Animal("Coco", 6, "Paloma");

        Animal animales [] = {c1, p1, g1, a1};
        for (int i = 0 ; i < animales.length; i++){
            System.out.println(animales[i]);
        }
    }
}
