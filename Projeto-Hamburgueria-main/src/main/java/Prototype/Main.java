package prototype;

public class Main {

    public static void main(String[] args) {

        Hamburguer original =
                new Hamburguer(
                        "X-Bacon",
                        "Brioche",
                        "Duplo Angus",
                        "Cheddar",
                        "Barbecue");

        System.out.println("===== ORIGINAL =====");

        original.mostrar();

        System.out.println();

        Hamburguer copia = original.clone();

        System.out.println("===== CÓPIA =====");

        copia.mostrar();

    }

}