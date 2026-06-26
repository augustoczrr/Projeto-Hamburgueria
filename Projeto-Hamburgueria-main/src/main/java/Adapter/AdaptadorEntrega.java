package adapter;

public class AdaptadorEntrega implements SistemaEntrega{

    private EntregaExterna entregaExterna;

    public AdaptadorEntrega(){

        entregaExterna = new EntregaExterna();

    }

    @Override
    public void entregarPedido(String pedido){

        entregaExterna.enviarEntrega(pedido);

    }

}