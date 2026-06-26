package interpreter;

public class ItemExpressao implements Expressao {

    private String item;

    public ItemExpressao(String item) {
        this.item = item;
    }

    @Override
    public void interpretar() {

        System.out.println("Item reconhecido: " + item);

    }

}