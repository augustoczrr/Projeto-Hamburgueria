package singleton;

public class Main {

    public static void main(String[] args) {

        Caixa caixa1 = Caixa.getInstancia();

        caixa1.receberPagamento(45.90);

        Caixa caixa2 = Caixa.getInstancia();

        caixa2.receberPagamento(62.50);

        Caixa caixa3 = Caixa.getInstancia();

        caixa3.retirar(20);

        System.out.println();

        caixa1.mostrarSaldo();

        System.out.println();

        System.out.println(caixa1 == caixa2);

        System.out.println(caixa2 == caixa3);

    }

}
