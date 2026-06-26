package mediator;

public class Entregador extends Participante {

    public Entregador(GerenciadorPedidos mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Entregador recebeu: " + mensagem);
    }

}