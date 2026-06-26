package factorymethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FactoryMethodTest {

    @Test
    void deveCriarXBurger() {

        Hamburguer h =
                new XBurgerFactory().criarHamburguer();

        assertNotNull(h);

    }

}