package visitor;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class VisitorTest {

    @Test
    void deveCalcularTotal() {

        CalculadoraPreco v =
                new CalculadoraPreco();

        Produto h =
                new Hamburguer(20);

        h.aceitar(v);

        assertEquals(20, v.getTotal());

    }

}