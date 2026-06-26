package adapter;

public class Main {

    public static void main(String[] args) {

        SistemaEntrega entrega =
                new AdaptadorEntrega();

        entrega.entregarPedido(
                "X-Burger + Batata + Refrigerante");

    }

}