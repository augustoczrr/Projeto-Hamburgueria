package factorymethod;

public class XBurger implements Hamburguer {

    @Override
    public void preparar() {
        System.out.println("Preparando X-Burger...");
    }

    @Override
    public void montar() {
        System.out.println("Montando pão, carne, queijo e molho.");
    }

    @Override
    public void servir() {
        System.out.println("Servindo X-Burger.");
    }

}
