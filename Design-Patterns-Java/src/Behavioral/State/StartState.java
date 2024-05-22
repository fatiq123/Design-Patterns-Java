package Behavioral.State;


public class StartState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("player is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
