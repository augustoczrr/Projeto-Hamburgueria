package mediator;

public class Cozinha extends Participante {

    public Cozinha(GerenciadorPedidos mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Cozinha recebeu: " + mensagem);
    }

}