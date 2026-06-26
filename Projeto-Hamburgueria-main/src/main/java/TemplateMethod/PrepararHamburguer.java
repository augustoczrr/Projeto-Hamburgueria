package templatemethod;

public abstract class PrepararHamburguer {


    public final void prepararPedido() {

        prepararPao();
        prepararCarne();
        adicionarIngredientes();
        embalar();
        servir();

    }

    private void prepararPao() {
        System.out.println("Preparando pão...");
    }

    private void prepararCarne() {
        System.out.println("Grelhando carne...");
    }

    protected abstract void adicionarIngredientes();

    private void embalar() {
        System.out.println("Embalando hambúrguer...");
    }

    private void servir() {
        System.out.println("Pedido pronto!");
    }

}