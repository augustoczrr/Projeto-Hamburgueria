package mediator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    void deveCriarMediator() {

        GerenciadorCentral g =
                new GerenciadorCentral();

        assertNotNull(g);

    }

}