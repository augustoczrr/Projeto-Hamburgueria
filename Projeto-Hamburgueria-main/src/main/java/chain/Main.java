package chain;

public class Main {

    public static void main(String[] args) {

        DescontoHandler vip = new DescontoVIP();
        DescontoHandler valor = new Desconto100();
        DescontoHandler cupom = new DescontoCupom();

        vip.setProximo(valor);
        valor.setProximo(cupom);

        System.out.println("====== Pedido 1 ======");

        Pedido pedido1 = new Pedido(150, true, false);

        vip.calcular(pedido1);

        System.out.println();

        System.out.println("====== Pedido 2 ======");

        Pedido pedido2 = new Pedido(120, false, false);

        vip.calcular(pedido2);

        System.out.println();

        System.out.println("====== Pedido 3 ======");

        Pedido pedido3 = new Pedido(60, false, true);

        vip.calcular(pedido3);

        System.out.println();

        System.out.println("====== Pedido 4 ======");

        Pedido pedido4 = new Pedido(40, false, false);

        vip.calcular(pedido4);

        System.out.println();

    }

}
