package factorymethod;

public class Main {

    public static void main(String[] args) {

        FabricaHamburguer fabrica;

        fabrica = new FabricaXBurger();

        Hamburguer burger = fabrica.criarHamburguer();

        burger.preparar();
        burger.montar();
        burger.servir();

        System.out.println();

        fabrica = new FabricaXSalada();

        Hamburguer salada = fabrica.criarHamburguer();

        salada.preparar();
        salada.montar();
        salada.servir();

    }

}
