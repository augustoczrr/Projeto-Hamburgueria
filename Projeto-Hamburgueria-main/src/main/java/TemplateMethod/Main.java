package templatemethod;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== X-BURGER =====");

        PrepararHamburguer pedido1 = new XBurger();

        pedido1.prepararPedido();

        System.out.println();

        System.out.println("===== X-SALADA =====");

        PrepararHamburguer pedido2 = new XSalada();

        pedido2.prepararPedido();

    }

}
