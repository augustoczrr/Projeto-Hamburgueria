package strategy;

public class Dinheiro implements FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento em Dinheiro");
        System.out.println("Valor: R$ " + valor);

    }

}