package chain;

public class Desconto100 extends DescontoHandler {

    @Override
    public void calcular(Pedido pedido) {

        if (pedido.getValor() >= 100) {

            double desconto = pedido.getValor() * 0.10;

            System.out.println("Pedido acima de R$100");
            System.out.println("Desconto: R$ " + desconto);

        } else if (proximo != null) {

            proximo.calcular(pedido);

        }

    }

}