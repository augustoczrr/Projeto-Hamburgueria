package decorator;

public abstract class DecoradorHamburguer implements Hamburguer {

    protected Hamburguer hamburguer;

    public DecoradorHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

}