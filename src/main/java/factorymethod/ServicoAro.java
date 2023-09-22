package factorymethod;

public class ServicoAro implements IServico {

    public String comprar() {
        return "Aro comprado";
    }

    public String vender() {
        return "Aro vendido";
    }
}