package command;

public class ControlePedido {

    private Comando comando;

    public void setComando(Comando comando) {

        this.comando = comando;

    }

    public void executar() {

        comando.executar();

    }

}