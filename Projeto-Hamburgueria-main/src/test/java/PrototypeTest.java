package prototype;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrototypeTest {

    @Test
    void deveClonarObjeto() {

        Hamburguer h =
                new Hamburguer(
                        "X",
                        "Pão",
                        "Carne",
                        "Queijo",
                        "Molho");

        Hamburguer clone = h.clone();

        assertNotSame(h, clone);

    }

}