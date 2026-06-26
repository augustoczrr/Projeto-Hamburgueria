package chain;

public class DescontoCupom extends DescontoHandler {

    @Override
    public void calcular(Pedido pedido) {

        if (pedido.possuiCupom()) {

            double desconto = pedido.getValor() * 0.05;

            System.out.println("Cupom aplicado");
            System.out.println("Desconto: R$ " + desconto);

        } else {

            System.out.println("Nenhum desconto disponível.");

        }

    }

}