package visitor;

public interface VisitorProduto {

    void visitar(Hamburguer hamburguer);

    void visitar(Batata batata);

    void visitar(Bebida bebida);

}