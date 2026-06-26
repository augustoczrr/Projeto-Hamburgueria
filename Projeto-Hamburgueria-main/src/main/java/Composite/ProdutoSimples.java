package composite;

public class ProdutoSimples extends Produto {

    private double preco;

    public ProdutoSimples(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public void mostrar() {

        System.out.println(nome + " - R$ " + preco);

    }

}