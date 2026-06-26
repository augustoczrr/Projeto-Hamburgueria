package strategy;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido(58.90);

        pedido.setPagamento(new Pix());

        pedido.finalizarPedido();

        System.out.println();

        pedido.setPagamento(new Cartao());

        pedido.finalizarPedido();

        System.out.println();

        pedido.setPagamento(new Dinheiro());

        pedido.finalizarPedido();

    }

}
