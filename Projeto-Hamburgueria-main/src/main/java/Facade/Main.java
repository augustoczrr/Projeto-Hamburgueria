package facade;

public class Main {

    public static void main(String[] args) {

        SistemaHamburgueria sistema =
                new SistemaHamburgueria();

        sistema.realizarPedido(
                "X-Burger + Batata + Refrigerante",
                42.90);

    }

}
