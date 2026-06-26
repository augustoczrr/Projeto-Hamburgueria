package adapter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdapterTest {

    @Test
    void deveCriarAdapter() {

        SistemaEntrega entrega =
                new AdaptadorEntrega();

        assertNotNull(entrega);

    }

}