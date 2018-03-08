import java.util.Scanner;

public class ConsoleUI {

    private Scanner scanner = new Scanner(System.in);

    public void start(Game game) {
        while(!game.isEnded()) {
            System.out.println("-------------");
            System.out.println(game.currentPlayerName() + "'s turn");
            System.out.println("Position: " + game.currentPlayerPosition());
            System.out.println("Please hit enter to roll a die.");

            scanner.nextLine();

            int face = game.currentPlayerRollDice();
            System.out.println("Dice face = " + face);
            game.currentPlayerMovePiece(face);
            System.out.println("Position: " + game.currentPlayerPosition());
            if(game.currentPlayerWins()) {
                System.out.println(game.currentPlayerName() + " WINS!");
                game.end();
            } else {
                game.switchPlayer();
            }
        }
    }

    public static void main(String[] args) {
        new ConsoleUI().start(new Game());
    }

}
