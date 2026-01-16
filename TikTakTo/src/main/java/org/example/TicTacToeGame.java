package org.example;

public class TicTacToeGame {
    public static void main(String[] args) throws InterruptedException {
        Board board = new Board();
        Player p1 = new ComputerPlayer('X');
        Player p2 = new ComputerPlayer('O');

        Player currentPlayer = p1;
        boolean gameRunning = true;

        System.out.println("--- Computer vs. Computer Tic Tac Toe ---");
        board.display();

        while (gameRunning) {
            currentPlayer.move(board);
            board.display();

            if (board.checkWin(currentPlayer.getSymbol())) {
                System.out.println("Spieler " + currentPlayer.getSymbol() + " gewinnt!");
                gameRunning = false;
            } else if (board.isFull()) {
                System.out.println("Unentschieden!");
                gameRunning = false;
            }

            currentPlayer = (currentPlayer == p1) ? p2 : p1;
            Thread.sleep(800);
        }
    }
}