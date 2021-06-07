package martinek.designpatterns.observer.tasrobserver;

public class O1emailServer extends Observerik {

    public O1emailServer(TASR message) {
        this.tasr = message;
        this.tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Správa odoslaná emailovým klientom znie: " + tasr.getMessage());
    }
}
