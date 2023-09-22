package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoAroTest {

    @Test
    void deveComprarAro() {
        IServico servico = ServicoFactory.obterServico("Aro");
        assertEquals("Aro comprado", servico.comprar());
    }

    @Test
    void deveVenderAro() {
        IServico servico = ServicoFactory.obterServico("Aro");
        assertEquals("Aro vendido", servico.vender());
    }

}