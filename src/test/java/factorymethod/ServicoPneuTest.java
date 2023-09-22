package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoPneuTest {

    @Test
    void deveComprarPneu() {
        IServico servico = ServicoFactory.obterServico("Pneu");
        assertEquals("Pneu comprado", servico.comprar());
    }

    @Test
    void deveVenderPneu() {
        IServico servico = ServicoFactory.obterServico("Pneu");
        assertEquals("Pneu vendido", servico.vender());
    }

}