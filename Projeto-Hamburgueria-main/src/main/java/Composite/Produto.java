package composite;

public abstract class Produto {

    protected String nome;

    public Produto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getPreco();

    public abstract void mostrar();

}