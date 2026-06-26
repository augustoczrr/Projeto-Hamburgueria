package command;

public class CancelarPedido implements Comando {

    private Hamburgueria hamburgueria;

    public CancelarPedido(Hamburgueria hamburgueria) {
        this.hamburgueria = hamburgueria;
    }

    @Override
    public void executar() {

        hamburgueria.cancelarPedido();

    }

}