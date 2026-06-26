package observer;

public class PainelCozinha implements Observer {

    @Override
    public void atualizar(String status) {

        System.out.println("Painel da Cozinha: Pedido " + status);

    }

}