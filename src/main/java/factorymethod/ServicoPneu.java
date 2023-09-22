package factorymethod;

public class ServicoPneu implements IServico {

    public String comprar() {
        return "Pneu comprado";
    }

    public String vender() {
        return "Pneu vendido";
    }
}
