package iterator;

public class Main {

    public static void main(String[] args) {

        Cardapio cardapio = new Cardapio();

        cardapio.adicionarProduto(
                new Produto("X-Burger",22));

        cardapio.adicionarProduto(
                new Produto("X-Salada",24));

        cardapio.adicionarProduto(
                new Produto("X-Bacon",28));

        cardapio.adicionarProduto(
                new Produto("Batata Frita",12));

        cardapio.adicionarProduto(
                new Produto("Refrigerante",8));

        IteratorProduto iterator =
                cardapio.criarIterator();

        System.out.println("===== CARDÁPIO =====");

        while(iterator.hasNext()){

            Produto produto = iterator.next();

            System.out.println(
                    produto.getNome()
                            + " - R$ "
                            + produto.getPreco());

        }

    }

}