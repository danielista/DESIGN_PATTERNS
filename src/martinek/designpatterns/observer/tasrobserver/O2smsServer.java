package martinek.designpatterns.observer.tasrobserver;

public class O2smsServer extends Observerik{
    public O2smsServer(TASR message) {
        this.tasr = message;
        this.tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Správa odoslaná SMS klientom znie: " + tasr.getMessage());
    }
}
