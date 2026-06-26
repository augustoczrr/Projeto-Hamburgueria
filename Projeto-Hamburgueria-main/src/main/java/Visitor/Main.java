package visitor;

public class Main {

    public static void main(String[] args) {

        Produto hamburguer =
                new Hamburguer(25);

        Produto batata =
                new Batata(12);

        Produto bebida =
                new Bebida(8);

        CalculadoraPreco visitor =
                new CalculadoraPreco();

        hamburguer.aceitar(visitor);
        batata.aceitar(visitor);
        bebida.aceitar(visitor);

        System.out.println("Valor total: R$ "
                + visitor.getTotal());

    }

}