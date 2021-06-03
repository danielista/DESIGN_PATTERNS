package martinek.designpatterns.state;

public class Red implements State {

    public void doAction(SemaforikContext semaforikContext) {
        System.out.println("REEEED STOP!");
        semaforikContext.setState(this);
    }

    public String toString(){
        return "RED STATE";
    }
}