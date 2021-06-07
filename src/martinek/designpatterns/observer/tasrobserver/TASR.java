package martinek.designpatterns.observer.tasrobserver;


import martinek.designpatterns.observer.Observer;

import java.util.ArrayList;
import java.util.List;

// prišla nova sprava ..cez setter a potom notify ;) všetkym observatorom
public class TASR {
    private List<Observerik> observers = new ArrayList<Observerik>();

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observerik observer : observers) {
            observer.update();
        }
    }

    private String message;

    public void attach(Observerik klient) {
        observers.add(klient);
    }
}
