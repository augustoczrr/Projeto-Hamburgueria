package visitor;

public class CalculadoraPreco implements VisitorProduto {

    private double total = 0;

    @Override
    public void visitar(Hamburguer hamburguer) {

        total += hamburguer.getPreco();

    }

    @Override
    public void visitar(Batata batata) {

        total += batata.getPreco();

    }

    @Override
    public void visitar(Bebida bebida) {

        total += bebida.getPreco();

    }

    public double getTotal() {

        return total;

    }

}