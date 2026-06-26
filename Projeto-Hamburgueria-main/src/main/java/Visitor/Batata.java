package visitor;

public class Batata implements Produto {

    private double preco;

    public Batata(double preco) {
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