package org.example;
import java.util.Random;
import java.util.List;

class ComputerPlayer implements Player {
    private char symbol;
    private Random random = new Random();

    public ComputerPlayer(char symbol) { this.symbol = symbol; }

    @Override
    public void move(Board board) {
        List<int[]> moves = board.getEmptyCells();
        int[] choice = moves.get(random.nextInt(moves.size()));
        board.makeMove(choice[0], choice[1], symbol);
        System.out.println("Computer " + symbol + " setzt auf: " + choice[0] + "," + choice[1]);
    }

    @Override
    public char getSymbol() { return symbol; }
}