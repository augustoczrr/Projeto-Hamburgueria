package strategy;

public class Cartao implements FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento no Cartão");
        System.out.println("Valor: R$ " + valor);

    }

}