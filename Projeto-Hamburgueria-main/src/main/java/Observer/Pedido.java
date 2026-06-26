package observer;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String status;

    private List<Observer> observers;

    public Pedido() {
        observers = new ArrayList<>();
    }

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {

        this.status = status;

        notificar();

    }

    private void notificar() {

        for (Observer observer : observers) {

            observer.atualizar(status);

        }

    }

}