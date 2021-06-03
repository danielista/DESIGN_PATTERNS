package martinek.designpatterns.state;

public class Orange implements State {

    public void doAction(SemaforikContext semaforikContext) {
        System.out.println("ORANGE get ready 3,2,1...");
        semaforikContext.setState(this);
    }

    public String toString(){
        return "ORANGE STATE";
    }
}