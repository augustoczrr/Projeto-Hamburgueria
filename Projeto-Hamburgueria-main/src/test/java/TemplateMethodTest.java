package templatemethod;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {

    @Test
    void deveCriarObjeto() {

        PrepararHamburguer h =
                new XBurger();

        assertNotNull(h);

    }

}