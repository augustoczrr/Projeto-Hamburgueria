package command;

public class RegistrarPedido implements Comando {

    private Hamburgueria hamburgueria;

    public RegistrarPedido(Hamburgueria hamburgueria) {
        this.hamburgueria = hamburgueria;
    }

    @Override
    public void executar() {

        hamburgueria.registrarPedido();

    }

}