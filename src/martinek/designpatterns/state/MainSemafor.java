package martinek.designpatterns.state;

public class MainSemafor {
    public static void main(String[] args) {
        SemaforikContext semaforikContext = new SemaforikContext();

        Red red = new Red();
        red.doAction(semaforikContext);

        System.out.println(semaforikContext.getState().toString());

        Orange orange = new Orange();
        orange.doAction(semaforikContext);

        System.out.println(semaforikContext.getState().toString());

        Green green = new Green();
        green.doAction(semaforikContext);

        System.out.println(semaforikContext.getState().toString());
    }
}