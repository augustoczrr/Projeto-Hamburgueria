package command;

public class PrepararPedido implements Comando {

    private Hamburgueria hamburgueria;

    public PrepararPedido(Hamburgueria hamburgueria) {
        this.hamburgueria = hamburgueria;
    }

    @Override
    public void executar() {

        hamburgueria.prepararPedido();

    }

}