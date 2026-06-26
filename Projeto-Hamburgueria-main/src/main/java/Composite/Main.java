package composite;

public class Main {

    public static void main(String[] args) {

        Produto burger =
                new ProdutoSimples("X-Burger",22);

        Produto batata =
                new ProdutoSimples("Batata Frita",12);

        Produto refri =
                new ProdutoSimples("Refrigerante",8);

        Produto sorvete =
                new ProdutoSimples("Sorvete",10);

        Combo combo = new Combo("Combo Família");

        combo.adicionar(burger);
        combo.adicionar(batata);
        combo.adicionar(refri);
        combo.adicionar(sorvete);

        combo.mostrar();

    }

}
