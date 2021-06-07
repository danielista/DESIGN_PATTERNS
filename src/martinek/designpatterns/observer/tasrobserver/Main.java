package martinek.designpatterns.observer.tasrobserver;

public class Main {
    public static void main(String[] args) {
        TASR tasr = new TASR();

        new O1emailServer(tasr);
        new O2smsServer(tasr);
        new O3faxServer(tasr);
        new O4facebookStatus(tasr);

        System.out.println("prvá nova sprava v tasr s prioritou 1");
        tasr.setMessage("KANADA JE MAJSTER SVETA",1);

        System.out.println("druhá nova sprava v tasr s prioritou 2");
        tasr.setMessage("zajtra nám končí karanténa", 2);

        System.out.println("tretia nova sprava v tasr s prioritou 3");
        tasr.setMessage("Vianoce prichádzajú", 3);


        System.out.println("tretia nova sprava v tasr s prioritou 4 a iné");
        tasr.setMessage("Slovensko má nový plán obnovy", -1);



    }
}
