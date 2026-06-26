package singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SingletonTest {

    @Test
    void deveRetornarMesmaInstancia() {

        Configuracao c1 = Configuracao.getInstance();
        Configuracao c2 = Configuracao.getInstance();

        assertSame(c1, c2);

    }

}