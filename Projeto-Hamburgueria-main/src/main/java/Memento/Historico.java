package memento;

public class Historico {

    private Memento memento;

    public void salvar(Memento memento) {

        this.memento = memento;

    }

    public Memento desfazer() {

        return memento;

    }

}