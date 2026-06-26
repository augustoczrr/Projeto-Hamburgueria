package decorator;

public class Main {

    public static void main(String[] args) {

        Hamburguer pedido = new XBurger();

        System.out.println(pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());

        System.out.println();

        pedido = new Bacon(pedido);

        System.out.println(pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());

        System.out.println();

        pedido = new CheddarExtra(pedido);

        System.out.println(pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());

        System.out.println();

        pedido = new decorator.OvoExtra(pedido);

        System.out.println(pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());

    }

}
