package flyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaIngredientes {

    private static Map<String, Ingrediente> ingredientes =
            new HashMap<>();

    public static Ingrediente getIngrediente(String nome) {

        if (!ingredientes.containsKey(nome)) {

            System.out.println("Criando ingrediente: " + nome);

            ingredientes.put(nome,
                    new Ingrediente(nome));

        }

        return ingredientes.get(nome);

    }

}