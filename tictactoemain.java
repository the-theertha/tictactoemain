import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicTacToe game = new TicTacToe();
        game.printBoard();
        boolean gameEnded = false;

        while (!gameEnded) {
            System.out.println("Player " + game.currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (game.placeMark(row, col)) {
                game.printBoard();

                if (game.checkForWin()) {
                    System.out.println("Player " + game.currentPlayer + " wins!");
                    gameEnded = true;
                } else if (game.isBoardFull()) {
                    System.out.println("The game is a tie!");
                    gameEnded = true;
                } else {
                    game.changePlayer();
                }
            } else {
                System.out.println("This move is not valid");
            }
        }
        scanner.close();
    }
}
