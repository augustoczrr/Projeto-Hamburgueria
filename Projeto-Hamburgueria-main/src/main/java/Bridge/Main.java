package bridge;

public class Main {

    public static void main(String[] args) {

        Hamburguer pedido1 =
                new XBurger(new PaoBrioche());

        pedido1.preparar();

        System.out.println();

        Hamburguer pedido2 =
                new XBurger(new PaoAustraliano());

        pedido2.preparar();

        System.out.println();

        Hamburguer pedido3 =
                new XSalada(new PaoBrioche());

        pedido3.preparar();

        System.out.println();

        Hamburguer pedido4 =
                new XSalada(new PaoAustraliano());

        pedido4.preparar();

    }

}
