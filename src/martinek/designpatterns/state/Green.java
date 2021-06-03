package martinek.designpatterns.state;

public class Green implements State{
    @Override
    public void doAction(SemaforikContext semaforikContext) {
        System.out.println("GREEEEEEEEEEEN go!");
        semaforikContext.setState(this);
    }
    public String toString(){
        return "GREEN STATE";
    }


}
