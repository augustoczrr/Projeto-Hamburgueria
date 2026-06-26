package chain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ChainTest {

    @Test
    void deveCriarPedidoVIP() {

        Pedido pedido =
                new Pedido(150,true,false);

        assertTrue(pedido.isVip());

    }

}