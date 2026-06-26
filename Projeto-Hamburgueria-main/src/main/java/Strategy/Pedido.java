package strategy;

public class Pedido {

    private double valor;
    private FormaPagamento pagamento;

    public Pedido(double valor) {
        this.valor = valor;
    }

    public void setPagamento(FormaPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void finalizarPedido() {

        pagamento.pagar(valor);

    }

}