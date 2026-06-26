package decorator;

public class Bacon extends DecoradorHamburguer {

    public Bacon(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + Bacon";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 4.50;
    }

}