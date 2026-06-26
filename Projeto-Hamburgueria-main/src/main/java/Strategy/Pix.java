package strategy;

public class Pix implements FormaPagamento {

    @Override
    public void pagar(double valor) {

        System.out.println("Pagamento via PIX");
        System.out.println("Valor: R$ " + valor);

    }

}