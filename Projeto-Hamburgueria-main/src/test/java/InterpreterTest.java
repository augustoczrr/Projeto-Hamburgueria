package interpreter;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InterpreterTest {

    @Test
    void deveCriarInterpretador() {

        InterpretadorPedido i =
                new InterpretadorPedido();

        assertNotNull(i);

    }

}