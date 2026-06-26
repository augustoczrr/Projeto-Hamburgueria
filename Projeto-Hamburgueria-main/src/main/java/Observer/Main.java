package observer;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Observer cozinha = new PainelCozinha();
        Observer aplicativo = new AppCliente();

        pedido.adicionarObserver(cozinha);
        pedido.adicionarObserver(aplicativo);

        pedido.setStatus("Recebido");

        System.out.println();

        pedido.setStatus("Em preparo");

        System.out.println();

        pedido.setStatus("Pronto");

        System.out.println();

        pedido.setStatus("Entregue");

    }

}
