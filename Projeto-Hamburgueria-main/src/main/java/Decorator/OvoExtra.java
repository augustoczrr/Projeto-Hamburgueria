package decorator;

public class OvoExtra extends DecoradorHamburguer {

    public OvoExtra(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + Ovo";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 2.50;
    }

}