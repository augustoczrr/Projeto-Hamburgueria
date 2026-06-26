package flyweight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FlyweightTest {

    @Test
    void deveCompartilharIngredientes() {

        Ingrediente i1 =
                FabricaIngredientes.getIngrediente("Cheddar");

        Ingrediente i2 =
                FabricaIngredientes.getIngrediente("Cheddar");

        assertSame(i1, i2);

    }

}