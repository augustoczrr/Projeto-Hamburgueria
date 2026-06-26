package memento;

public class Main {

    public static void main(String[] args) {

        Pedido pedido =
                new Pedido("X-Burger");

        Historico historico =
                new Historico();

        System.out.println("Pedido: "
                + pedido.getDescricao());

        historico.salvar(
                pedido.salvar());

        pedido.setDescricao(
                "X-Burger + Bacon");

        System.out.println("Alterado: "
                + pedido.getDescricao());

        pedido.restaurar(
                historico.desfazer());

        System.out.println("Restaurado: "
                + pedido.getDescricao());

    }

}