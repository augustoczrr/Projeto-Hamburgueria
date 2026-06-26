package iterator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IteratorTest {

    @Test
    void devePercorrerCardapio() {

        Cardapio c = new Cardapio();

        c.adicionarProduto(
                new Produto("Burger",20));

        IteratorProduto it =
                c.criarIterator();

        assertTrue(it.hasNext());

    }

}