package abstractfactory;

public class Refrigerante implements Bebida{

    @Override
    public void servir() {
        System.out.println("Refrigerante");
    }

}
