package visitor;

public class Bebida implements Produto {

    private double preco;

    public Bebida(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void aceitar(VisitorProduto visitor) {
        visitor.visitar(this);
    }

}