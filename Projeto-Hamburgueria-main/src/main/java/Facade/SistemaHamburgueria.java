package facade;

public class SistemaHamburgueria {

    private Caixa caixa;
    private Pagamento pagamento;
    private Cozinha cozinha;
    private Entrega entrega;

    public SistemaHamburgueria(){

        caixa = new Caixa();
        pagamento = new Pagamento();
        cozinha = new Cozinha();
        entrega = new Entrega();

    }

    public void realizarPedido(String pedido,double valor){

        caixa.registrarPedido(pedido);

        pagamento.pagar(valor);

        cozinha.preparar(pedido);

        entrega.entregar();

        System.out.println("Pedido finalizado com sucesso.");

    }

}