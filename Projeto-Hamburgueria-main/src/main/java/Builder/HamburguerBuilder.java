package builder;

public class HamburguerBuilder {

    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public HamburguerBuilder setPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }

    public HamburguerBuilder setCarne(String carne) {
        hamburguer.setCarne(carne);
        return this;
    }

    public HamburguerBuilder setQueijo(String queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }

    public HamburguerBuilder setSalada(String salada) {
        hamburguer.setSalada(salada);
        return this;
    }

    public HamburguerBuilder setMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }

    public Hamburguer build() {
        return hamburguer;
    }

}