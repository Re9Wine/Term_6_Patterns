import State.IState;

public class TVContext implements IState {
    private IState state;

    public IState getState() {
        return state;
    }

    public void setState(IState state) {
        this.state = state;
    }

    @Override
    public void doAction() {
        this.state.doAction();
    }
}
