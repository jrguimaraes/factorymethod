package factorymethod;

public class ServicoCalota implements IServico {

    public String comprar() {
        return "Calota comprada";
    }

    public String vender() {
        return "Calota vendida";
    }
}
