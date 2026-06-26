package singleton;

public class Caixa {

    private static Caixa instancia;

    private double saldo;

    private Caixa() {
        saldo = 0;
    }

    public static Caixa getInstancia() {

        if (instancia == null) {
            instancia = new Caixa();
        }

        return instancia;
    }

    public void receberPagamento(double valor) {
        saldo += valor;
        System.out.println("Pagamento recebido: R$ " + valor);
    }

    public void retirar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Retirada de R$ " + valor);
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void mostrarSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

}
