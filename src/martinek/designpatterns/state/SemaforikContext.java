package martinek.designpatterns.state;


// tato trieda je iba na zmenu statu :D
public class SemaforikContext {
    private State state;

    public SemaforikContext(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}