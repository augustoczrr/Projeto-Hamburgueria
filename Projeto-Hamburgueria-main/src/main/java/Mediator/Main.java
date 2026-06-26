package mediator;

public class Main {

    public static void main(String[] args) {

        GerenciadorCentral mediator = new GerenciadorCentral();

        Caixa caixa = new Caixa(mediator);
        Cozinha cozinha = new Cozinha(mediator);
        Entregador entregador = new Entregador(mediator);

        mediator.setCaixa(caixa);
        mediator.setCozinha(cozinha);
        mediator.setEntregador(entregador);

        System.out.println("=== Cliente realiza pedido ===");

        caixa.enviar("X-Burger + Batata + Refrigerante");

        System.out.println();

        System.out.println("=== Cozinha finaliza pedido ===");

        cozinha.enviar("Pedido pronto");

        System.out.println();

        System.out.println("=== Entregador entrega pedido ===");

        entregador.enviar("Pedido entregue");

    }

}
