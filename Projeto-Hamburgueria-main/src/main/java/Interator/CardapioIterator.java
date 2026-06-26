package iterator;

import java.util.List;

public class CardapioIterator implements IteratorProduto {

    private List<Produto> produtos;
    private int indice = 0;

    public CardapioIterator(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public boolean hasNext() {
        return indice < produtos.size();
    }

    @Override
    public Produto next() {
        return produtos.get(indice++);
    }

}