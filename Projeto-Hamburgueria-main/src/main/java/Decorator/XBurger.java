package decorator;

public class XBurger implements Hamburguer {

    @Override
    public String getDescricao() {
        return "X-Burger";
    }

    @Override
    public double getPreco() {
        return 20.00;
    }

}