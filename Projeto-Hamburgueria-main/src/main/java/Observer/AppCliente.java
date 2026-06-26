package observer;

public class AppCliente implements Observer {

    @Override
    public void atualizar(String status) {

        System.out.println("Aplicativo: Seu pedido está " + status);

    }

}