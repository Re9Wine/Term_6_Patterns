import State.IState;
import State.TVStateOff;
import State.TVStateOn;

public class Main {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        IState tvStateOn = new TVStateOn();
        IState tvStateOff = new TVStateOff();

        context.setState(tvStateOn);
        context.doAction();

        context.setState(tvStateOff);
        context.doAction();
    }
}