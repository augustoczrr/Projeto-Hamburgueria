package chain;

public class Pedido {

    private double valor;
    private boolean vip;
    private boolean cupom;

    public Pedido(double valor, boolean vip, boolean cupom) {
        this.valor = valor;
        this.vip = vip;
        this.cupom = cupom;
    }

    public double getValor() {
        return valor;
    }

    public boolean isVip() {
        return vip;
    }

    public boolean possuiCupom() {
        return cupom;
    }

}