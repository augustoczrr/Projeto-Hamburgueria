package command;

public class Main {

    public static void main(String[] args) {

        Hamburgueria hamburgueria = new Hamburgueria();

        ControlePedido controle = new ControlePedido();

        System.out.println("=== Registrar ===");

        controle.setComando(
                new RegistrarPedido(hamburgueria));

        controle.executar();

        System.out.println();

        System.out.println("=== Preparar ===");

        controle.setComando(
                new PrepararPedido(hamburgueria));

        controle.executar();

        System.out.println();

        System.out.println("=== Entregar ===");

        controle.setComando(
                new EntregarPedido(hamburgueria));

        controle.executar();

        System.out.println();

        System.out.println("=== Cancelar ===");

        controle.setComando(
                new CancelarPedido(hamburgueria));

        controle.executar();

    }

}