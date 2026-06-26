package composite;

import java.util.ArrayList;
import java.util.List;

public class Combo extends Produto {

    private List<Produto> produtos;

    public Combo(String nome) {
        super(nome);
        produtos = new ArrayList<>();
    }

    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    public void remover(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public double getPreco() {

        double total = 0;

        for (Produto produto : produtos) {
            total += produto.getPreco();
        }

        return total;

    }

    @Override
    public void mostrar() {

        System.out.println("===== " + nome + " =====");

        for (Produto produto : produtos) {
            produto.mostrar();
        }

        System.out.println("----------------------");
        System.out.println("Total: R$ " + getPreco());

    }

}