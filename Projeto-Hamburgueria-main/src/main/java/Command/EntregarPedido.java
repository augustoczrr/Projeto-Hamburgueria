package command;

public class EntregarPedido implements Comando {

    private Hamburgueria hamburgueria;

    public EntregarPedido(Hamburgueria hamburgueria) {
        this.hamburgueria = hamburgueria;
    }

    @Override
    public void executar() {

        hamburgueria.entregarPedido();

    }

}