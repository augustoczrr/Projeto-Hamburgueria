package facade;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FacadeTest {

    @Test
    void deveCriarSistema() {

        SistemaHamburgueria sistema =
                new SistemaHamburgueria();

        assertNotNull(sistema);

    }

}