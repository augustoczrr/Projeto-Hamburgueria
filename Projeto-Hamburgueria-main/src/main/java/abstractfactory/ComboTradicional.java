package abstractfactory;

public class ComboTradicional implements FabricaCombo{

    @Override
    public Hamburguer criarHamburguer() {
        return new XBurger();
    }

    @Override
    public Batata criarBatata() {
        return new BatataFrita();
    }

    @Override
    public Bebida criarBebida() {
        return new Refrigerante();
    }

}
