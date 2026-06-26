package abstractfactory;

public class Main {

    public static void main(String[] args) {

        FabricaCombo combo;

        System.out.println("===== COMBO TRADICIONAL =====");

        combo = new ComboTradicional();

        combo.criarHamburguer().preparar();
        combo.criarBatata().fritar();
        combo.criarBebida().servir();

        System.out.println();

        System.out.println("===== COMBO VEGETARIANO =====");

        combo = new ComboVegetariano();

        combo.criarHamburguer().preparar();
        combo.criarBatata().fritar();
        combo.criarBebida().servir();

    }

}
