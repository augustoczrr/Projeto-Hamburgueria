package composite;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    void deveSomarPrecos() {

        Combo combo = new Combo("Combo");

        combo.adicionar(new ProdutoSimples("Burger",20));
        combo.adicionar(new ProdutoSimples("Refri",8));

        assertEquals(28, combo.getPreco());

    }

}