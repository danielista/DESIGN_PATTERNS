package martinek.designpatterns.observer.tasrobserver;


import java.util.ArrayList;
import java.util.List;

// prišla nova sprava ..cez setter a potom notify ;) všetkym observatorom
public class TASR {
    private List<Observerik> observers = new ArrayList<Observerik>();
    private String message;
    private int priority;


    public int getPriority() {
        return priority;
    }

    public String getMessage() {
        return message;
    }

    // nastaví a príjme správu.. a dá o tom vedieť všetkým observerom

    /*
    1 all observers
    2 email,fb
    3 email
    ine cislo nikto spravu neriesi ;)
     */

    // setting message and priority of sending ..
    public void setMessage(String message, int priority) {
        if(priority==1){
            this.message = message;
            notifyAllObservers();
        }
        else if(priority==2){
            this.message = message;
            for (int i = 0; i < observers.size(); i++) {
                if(i==0 || i==3){
                    Observerik observer = observers.get(i);
                    observer.update();
                }
            }
        }
        else if(priority==3){
            this.message = message;
            Observerik observer = observers.get(0);
            observer.update();
        }
        else System.out.println(" NOTHING HAPPENING ;)");
    }

    private void notifyAllObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observerik observer = observers.get(i);
            observer.update();
        }
    }



    public void attach(Observerik klient) {
        observers.add(klient);
    }

    public void remove(){

    }

}
