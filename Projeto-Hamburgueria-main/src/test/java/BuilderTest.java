package builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BuilderTest {

    @Test
    void deveConstruirHamburguer() {

        Hamburguer h = new HamburguerBuilder()
                .setPao("Brioche")
                .setCarne("Angus")
                .setQueijo("Cheddar")
                .build();

        assertNotNull(h);

    }

}