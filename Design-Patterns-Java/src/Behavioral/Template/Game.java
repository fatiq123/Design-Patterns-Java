package Behavioral.Template;

public abstract class Game {

    public abstract void initialize();
    public abstract void startGame();
    public abstract void endGame();

    // we make it final so that subclass cannot override it
    public final void play() {
        initialize();
        startGame();
        endGame();
    }


}
