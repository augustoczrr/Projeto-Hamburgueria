package mediator;

public class GerenciadorCentral implements GerenciadorPedidos {

    private Caixa caixa;
    private Cozinha cozinha;
    private Entregador entregador;

    public void setCaixa(Caixa caixa) {
        this.caixa = caixa;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    @Override
    public void enviarMensagem(String mensagem, Participante participante) {

        if (participante == caixa) {

            cozinha.receber("Novo pedido: " + mensagem);

        } else if (participante == cozinha) {

            entregador.receber("Pedido pronto para entrega.");

        } else if (participante == entregador) {

            caixa.receber("Pedido entregue ao cliente.");

        }

    }

}