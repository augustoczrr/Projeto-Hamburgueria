package flyweight;

public class Main {

    public static void main(String[] args) {

        Hamburguer xBurger =
                new Hamburguer("X-Burger");

        xBurger.adicionarIngrediente("Pão Brioche");
        xBurger.adicionarIngrediente("Carne Angus");
        xBurger.adicionarIngrediente("Cheddar");
        xBurger.adicionarIngrediente("Molho Especial");

        Hamburguer xBacon =
                new Hamburguer("X-Bacon");

        xBacon.adicionarIngrediente("Pão Brioche");
        xBacon.adicionarIngrediente("Carne Angus");
        xBacon.adicionarIngrediente("Cheddar");
        xBacon.adicionarIngrediente("Bacon");

        Hamburguer xSalada =
                new Hamburguer("X-Salada");

        xSalada.adicionarIngrediente("Pão Brioche");
        xSalada.adicionarIngrediente("Carne Angus");
        xSalada.adicionarIngrediente("Cheddar");
        xSalada.adicionarIngrediente("Alface");
        xSalada.adicionarIngrediente("Tomate");

        xBurger.mostrar();

        xBacon.mostrar();

        xSalada.mostrar();

    }

}