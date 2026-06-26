package memento;

public class Pedido {

    private String descricao;

    public Pedido(String descricao) {
        this.descricao = descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public Memento salvar() {

        return new Memento(descricao);

    }

    public void restaurar(Memento memento) {

        descricao = memento.getEstado();

    }

}