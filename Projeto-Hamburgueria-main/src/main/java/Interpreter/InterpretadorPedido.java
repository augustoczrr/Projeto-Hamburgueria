package interpreter;

public class InterpretadorPedido {

    public void interpretarPedido(String pedido) {

        String[] itens = pedido.split("\\+");

        System.out.println("Interpretando pedido...");

        for (String item : itens) {

            Expressao expressao =
                    new ItemExpressao(item.trim());

            expressao.interpretar();

        }

    }

}