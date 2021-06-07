package martinek.designpatterns.observer.tasrobserver;

public class Main {
    public static void main(String[] args) {
        TASR tasr = new TASR();

        new O1emailServer(tasr);
        new O2smsServer(tasr);
        new O3faxServer(tasr);
        new O4facebookStatus(tasr);

        System.out.println("prvá nova sprava v tasr");
        tasr.setMessage("KANADA JE MAJSTER SVETA");
    }
}
