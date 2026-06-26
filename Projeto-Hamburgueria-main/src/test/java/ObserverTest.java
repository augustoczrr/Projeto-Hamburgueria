package observer;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    void deveCriarPedido() {

        Pedido pedido = new Pedido();

        assertNotNull(pedido);

    }

}