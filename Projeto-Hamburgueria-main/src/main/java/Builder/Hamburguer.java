package builder;

public class Hamburguer {

    private String pao;
    private String carne;
    private String queijo;
    private String salada;
    private String molho;

    public void setPao(String pao) {
        this.pao = pao;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    public void mostrarPedido() {

        System.out.println("===== HAMBÚRGUER =====");
        System.out.println("Pão: " + pao);
        System.out.println("Carne: " + carne);
        System.out.println("Queijo: " + queijo);
        System.out.println("Salada: " + salada);
        System.out.println("Molho: " + molho);

    }

}