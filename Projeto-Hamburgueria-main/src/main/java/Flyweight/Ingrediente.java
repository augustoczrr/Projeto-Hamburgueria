package flyweight;

public class Ingrediente {

    private String nome;

    public Ingrediente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void mostrar() {
        System.out.println(nome);
    }

}