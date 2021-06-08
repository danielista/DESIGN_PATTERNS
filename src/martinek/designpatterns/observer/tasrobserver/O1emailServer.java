package martinek.designpatterns.observer.tasrobserver;

public class O1emailServer extends Observerik {

    public O1emailServer(TASR message) {
        this.tasr = message;
        this.tasr.attach(this);
    }


    // 2. sposob..je upraviť update, vyťahovaním priority z TASR
    // if(TASR.getPriority()==1)
    @Override
    public void update() {
        System.out.println("Správa odoslaná emailovým klientom znie: " + tasr.getMessage());
    }
}
