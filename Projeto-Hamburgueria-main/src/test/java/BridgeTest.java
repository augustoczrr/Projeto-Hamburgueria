package bridge;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BridgeTest {

    @Test
    void deveCriarEntrega() {

        Entrega entrega =
                new EntregaDelivery(new Moto());

        assertNotNull(entrega);

    }

}