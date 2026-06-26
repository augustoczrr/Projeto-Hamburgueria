package visitor;

public class Hamburguer implements Produto {

    private double preco;

    public Hamburguer(double preco) {
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