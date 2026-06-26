package flyweight;

import java.util.ArrayList;
import java.util.List;

public class Hamburguer {

    private String nome;

    private List<Ingrediente> ingredientes =
            new ArrayList<>();

    public Hamburguer(String nome) {
        this.nome = nome;
    }

    public void adicionarIngrediente(String ingrediente) {

        ingredientes.add(
                FabricaIngredientes.getIngrediente(ingrediente));

    }

    public void mostrar() {

        System.out.println();

        System.out.println("=== " + nome + " ===");

        for (Ingrediente ingrediente : ingredientes) {

            ingrediente.mostrar();

        }

    }

}