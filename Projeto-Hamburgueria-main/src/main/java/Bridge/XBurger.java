package bridge;

public class XBurger extends Hamburguer {

    public XBurger(Pao pao) {
        super(pao);
    }

    @Override
    public void preparar() {

        System.out.println("Preparando X-Burger");
        System.out.println("Utilizando " + pao.tipoPao());

    }

}