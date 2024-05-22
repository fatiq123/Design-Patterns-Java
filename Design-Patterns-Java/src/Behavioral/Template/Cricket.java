package Behavioral.Template;

public class Cricket extends Game {
    @Override
    public void initialize() {
        System.out.println("Cricket Game is initialized");
    }

    @Override
    public void startGame() {
        System.out.println("Cricket Game is started. Play the game");
    }

    @Override
    public void endGame() {
        System.out.println("End Cricket the game");
    }


}
