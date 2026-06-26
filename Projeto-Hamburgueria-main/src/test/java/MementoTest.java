package memento;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MementoTest {

    @Test
    void deveRestaurarPedido() {

        Pedido pedido =
                new Pedido("X");

        Historico h =
                new Historico();

        h.salvar(pedido.salvar());

        pedido.setDescricao("X Bacon");

        pedido.restaurar(h.desfazer());

        assertEquals("X",
                pedido.getDescricao());

    }

}