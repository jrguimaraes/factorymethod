package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServicoCalotaTest {

    @Test
    void deveComprarCalota() {
        IServico servico = ServicoFactory.obterServico("Calota");
        assertEquals("Calota comprada", servico.comprar());
    }

    @Test
    void deveVenderCalota() {
        IServico servico = ServicoFactory.obterServico("Calota");
        assertEquals("Calota vendida", servico.vender());
    }

}