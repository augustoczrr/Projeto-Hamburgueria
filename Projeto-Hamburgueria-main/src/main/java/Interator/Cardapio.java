package iterator;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {

    private List<Produto> produtos;

    public Cardapio() {

        produtos = new ArrayList<>();

    }

    public void adicionarProduto(Produto produto) {

        produtos.add(produto);

    }

    public IteratorProduto criarIterator() {

        return new CardapioIterator(produtos);

    }

}