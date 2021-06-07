package martinek.designpatterns.observer.tasrobserver;

public class O4facebookStatus extends Observerik{
    public O4facebookStatus(TASR message) {
        this.tasr = message;
        this.tasr.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Správa odoslaná FACEBOOK klientom znie: " + tasr.getMessage());
    }
}
