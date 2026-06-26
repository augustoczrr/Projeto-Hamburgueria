package bridge;

public class XSalada extends Hamburguer {

    public XSalada(Pao pao) {
        super(pao);
    }

    @Override
    public void preparar() {

        System.out.println("Preparando X-Salada");
        System.out.println("Utilizando " + pao.tipoPao());

    }

}