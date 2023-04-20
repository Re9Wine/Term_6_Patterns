package State;

public class TVStateOn implements IState {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
