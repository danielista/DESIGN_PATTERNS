package martinek.designpatterns.observer.tasrobserver;

public class O3faxServer extends Observerik {
    public O3faxServer(TASR message) {
        this.tasr = message;
        this.tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Správa odoslaná FAXOM znie: " + tasr.getMessage());
    }
}
