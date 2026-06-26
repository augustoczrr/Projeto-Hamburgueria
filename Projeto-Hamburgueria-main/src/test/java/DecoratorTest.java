package decorator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    void deveAdicionarIngredientes() {

        Hamburguer h = new XBurger();

        h = new Bacon(h);
        h = new CheddarExtra(h);

        assertEquals(
                "X-Burger + Bacon + Cheddar",
                h.getDescricao());

    }

}