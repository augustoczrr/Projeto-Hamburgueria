package decorator;

public class CheddarExtra extends DecoradorHamburguer {

    public CheddarExtra(Hamburguer hamburguer) {
        super(hamburguer);
    }

    @Override
    public String getDescricao() {
        return hamburguer.getDescricao() + " + Cheddar";
    }

    @Override
    public double getPreco() {
        return hamburguer.getPreco() + 3.00;
    }

}