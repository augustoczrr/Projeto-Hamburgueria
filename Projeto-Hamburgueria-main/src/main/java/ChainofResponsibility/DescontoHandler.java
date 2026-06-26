package chain;

public abstract class DescontoHandler {

    protected DescontoHandler proximo;

    public void setProximo(DescontoHandler proximo) {
        this.proximo = proximo;
    }

    public abstract void calcular(Pedido pedido);

}