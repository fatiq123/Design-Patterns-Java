package Behavioral.Template;

public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("Football Game is initialized");
    }

    @Override
    public void startGame() {
        System.out.println("Football Game is started. Play the game");
    }

    @Override
    public void endGame() {
        System.out.println("Football End the football game");
    }
}
