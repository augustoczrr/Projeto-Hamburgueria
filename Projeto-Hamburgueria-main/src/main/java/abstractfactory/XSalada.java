package abstractfactory;

public class XSalada implements Hamburguer {

    @Override
    public void preparar() {
        System.out.println("Preparando X-Salada...");
    }

    @Override
    public void montar() {
        System.out.println("Montando pão, carne, queijo, alface e tomate.");
    }

    @Override
    public void servir() {
        System.out.println("Servindo X-Salada.");
    }

}
