package abstractfactory;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AbstractFactoryTest {

    @Test
    void deveCriarProdutos() {

        HamburguerFactory factory =
                new ComboTradicionalFactory();

        assertNotNull(factory.criarHamburguer());
        assertNotNull(factory.criarBebida());

    }

}