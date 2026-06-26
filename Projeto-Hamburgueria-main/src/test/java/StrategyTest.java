package strategy;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StrategyTest {

    @Test
    void deveAlterarFormaPagamento() {

        Pagamento pagamento = new Pagamento();

        pagamento.setStrategy(new CartaoCredito());

        assertNotNull(pagamento);

    }

}