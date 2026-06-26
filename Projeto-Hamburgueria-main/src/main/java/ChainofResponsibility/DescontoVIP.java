package chain;

public class DescontoVIP extends DescontoHandler {

    @Override
    public void calcular(Pedido pedido) {

        if (pedido.isVip()) {

            double desconto = pedido.getValor() * 0.20;

            System.out.println("Cliente VIP");
            System.out.println("Desconto: R$ " + desconto);

        } else if (proximo != null) {

            proximo.calcular(pedido);

        }

    }

}