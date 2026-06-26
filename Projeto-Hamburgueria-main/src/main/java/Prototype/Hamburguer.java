package prototype;

public class Hamburguer implements Cloneable {

    private String nome;
    private String pao;
    private String carne;
    private String queijo;
    private String molho;

    public Hamburguer(String nome,
                      String pao,
                      String carne,
                      String queijo,
                      String molho) {

        this.nome = nome;
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.molho = molho;

    }

    @Override
    public Hamburguer clone() {

        try {

            return (Hamburguer) super.clone();

        } catch (CloneNotSupportedException e) {

            return null;

        }

    }

    public void mostrar() {

        System.out.println("Nome: " + nome);
        System.out.println("Pão: " + pao);
        System.out.println("Carne: " + carne);
        System.out.println("Queijo: " + queijo);
        System.out.println("Molho: " + molho);

    }

}