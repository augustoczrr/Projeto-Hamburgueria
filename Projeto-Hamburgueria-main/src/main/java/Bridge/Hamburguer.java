package bridge;

public abstract class Hamburguer {

    protected Pao pao;

    public Hamburguer(Pao pao) {
        this.pao = pao;
    }

    public abstract void preparar();

}