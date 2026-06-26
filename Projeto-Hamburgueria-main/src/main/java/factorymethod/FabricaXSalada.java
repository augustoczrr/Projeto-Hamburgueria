package factorymethod;

public class FabricaXSalada extends FabricaHamburguer {

    @Override
    public Hamburguer criarHamburguer() {
        return new XSalada();
    }

}
