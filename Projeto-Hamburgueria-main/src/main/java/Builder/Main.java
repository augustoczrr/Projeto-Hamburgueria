package builder;

public class Main {

    public static void main(String[] args) {

        Hamburguer xBurger = new HamburguerBuilder()
                .setPao("Brioche")
                .setCarne("Carne Bovina")
                .setQueijo("Cheddar")
                .setSalada("Alface")
                .setMolho("Barbecue")
                .build();

        xBurger.mostrarPedido();

        System.out.println();

        Hamburguer artesanal = new HamburguerBuilder()
                .setPao("Australiano")
                .setCarne("Duplo Angus")
                .setQueijo("Prato")
                .setSalada("Rúcula")
                .setMolho("Especial da Casa")
                .build();

        artesanal.mostrarPedido();

    }

}
