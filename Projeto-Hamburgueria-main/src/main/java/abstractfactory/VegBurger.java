package abstractfactory;

public class VegBurger implements Hamburguer{

    @Override
    public void preparar() {
        System.out.println("Hambúrguer Vegetariano");
    }

}
