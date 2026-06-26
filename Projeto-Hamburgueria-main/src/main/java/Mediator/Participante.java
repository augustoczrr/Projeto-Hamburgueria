package mediator;

public abstract class Participante {

    protected GerenciadorPedidos mediator;

    public Participante(GerenciadorPedidos mediator) {
        this.mediator = mediator;
    }

    public abstract void receber(String mensagem);

}