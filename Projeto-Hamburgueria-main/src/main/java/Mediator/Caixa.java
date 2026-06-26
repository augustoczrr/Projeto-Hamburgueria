package mediator;

public class Caixa extends Participante {

    public Caixa(GerenciadorPedidos mediator) {
        super(mediator);
    }

    public void enviar(String mensagem) {
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println("Caixa recebeu: " + mensagem);
    }

}