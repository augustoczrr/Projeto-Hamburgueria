package abstractfactory;

public class ComboVegetariano implements FabricaCombo{

    @Override
    public Hamburguer criarHamburguer() {
        return new VegBurger();
    }

    @Override
    public Batata criarBatata() {
        return new BatataRustica();
    }

    @Override
    public Bebida criarBebida() {
        return new SucoNatural();
    }

}
