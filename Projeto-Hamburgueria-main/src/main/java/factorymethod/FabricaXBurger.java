package factorymethod;

public class FabricaXBurger extends FabricaHamburguer {

    @Override
    public Hamburguer criarHamburguer() {
        return new XBurger();
    }

}
