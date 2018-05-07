package main;

public class Main {

    public static void main(String[] args) {
        SnakeGame game = new SnakeGame();
        SnakeGui gui = new SnakeGui(game);
        gui.setVisible(true);
        game.start();
    }

}
