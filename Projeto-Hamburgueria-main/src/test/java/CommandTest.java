package command;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CommandTest {

    @Test
    void deveCriarComando() {

        Hamburgueria h =
                new Hamburgueria();

        Comando comando =
                new RegistrarPedido(h);

        assertNotNull(comando);

    }

}