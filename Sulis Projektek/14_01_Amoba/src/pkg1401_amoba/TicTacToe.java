
package pkg1401_amoba;

import java.util.Scanner;


public class TicTacToe {

    
    public static void main(String[] args) {
        int[][] table = tableInit();
        int currentPlayer = 1;
        int result;
        int[] move;  //* két elemű egydimenziós tömb, 0-val 
        Scanner sc = new Scanner(System.in);
        do {
            drawTable(table);
            move = getValidMove(sc, table, currentPlayer);
            makeMove(table, move, currentPlayer);
            result = checkWinner(table);
            currentPlayer = nextPlayer(currentPlayer);
        } while (result == 0);
        drawTable(table);
        displayWinner(result);
    }
    
    public static int[][] tableInit() {
        return new int[3][3];
    }

    public static void drawTable(int[][] table) {
        System.out.println("+-+-+-+");
        System.out.println("|" + table[0][0] + "|" + table[0][1] + "|" + table[0][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[1][0] + "|" + table[1][1] + "|" + table[1][2] + "|");
        System.out.println("+-+-+-+");
        System.out.println("|" + table[2][0] + "|" + table[2][1] + "|" + table[2][2] + "|");
        System.out.println("+-+-+-+");
    }

    public static int[] getValidMove(Scanner sc, int[][] table, int currentPlayer) {
        int[] move = new int[2];
        int line;
        int col;
        boolean hiba;
        System.out.println("A(z) " + currentPlayer + "-es játékos következik.");
        do {
            System.out.println("Melyik sor?");
            line = sc.nextInt();
            System.out.println("Melyik oszlop?");
            col = sc.nextInt();
            hiba = (line < 0 || line > 2 || col < 0 || col > 2 || table[line][col] != 0);
            if (hiba) {
                System.out.println("Hibás mezőszám!");
            }
        } while (hiba);
        move[0] = line;
        move[1] = col;

        return move;
    }

    public static void makeMove(int[][] table, int[] move, int currentPlayer) {
        table[move[0]][move[1]] = currentPlayer;
    }

    public static final int DRAW = 3;
    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static int COUNTER = 0;

    public static int checkWinner(int[][] table) {
        int winner = 0;
        COUNTER++;
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == PYR_ONE || table[i][j] == PYR_TWO && table[i][j] == 0) {
                    winner = 0;
                } else if (COUNTER == table.length * table.length && table[i][j] != 0) {
                    winner = DRAW;
                }
            }
        }
        for (int line = 0; line < table.length; line++) {
            if (table[line][0] == PYR_ONE && table[line][1] == PYR_ONE && table[line][2] == PYR_ONE) {
                winner = FIRST;
            }
        }
        for (int col = 0; col < table.length; col++) {
            if (table[0][col] == PYR_ONE && table[1][col] == PYR_ONE && table[2][col] == PYR_ONE) {
                winner = FIRST;
            }
        }
        if (table[0][0] == PYR_ONE && table[1][1] == PYR_ONE && table[2][2] == PYR_ONE) {
            winner = FIRST;
        }
        if (table[2][0] == PYR_ONE && table[1][1] == PYR_ONE && table[0][2] == PYR_ONE) {
            winner = FIRST;
        }
        for (int line = 0; line < table.length; line++) {
            if (table[line][0] == PYR_TWO && table[line][1] == PYR_TWO && table[line][2] == PYR_TWO) {
                winner = SECOND;
            }
        }
        for (int col = 0; col < table.length; col++) {
            if (table[0][col] == PYR_TWO && table[1][col] == PYR_TWO && table[2][col] == PYR_TWO) {
                winner = SECOND;
            }
        }
        if (table[0][0] == PYR_TWO && table[1][1] == PYR_TWO && table[2][2] == PYR_TWO) {
            winner = SECOND;
        }
        if (table[2][0] == PYR_TWO && table[1][1] == PYR_TWO && table[0][2] == PYR_TWO) {
            winner = SECOND;
        }
        return winner;
    }

    public static final int PYR_ONE = 1;
    public static final int PYR_TWO = 2;

    public static int nextPlayer(int currentPlayer) {
        if (currentPlayer == PYR_ONE) {
            return PYR_TWO;
        } else {
            return PYR_ONE;
        }
    }

    public static void displayWinner(int result) {
        if (result == FIRST) {
            System.out.print("Az 1-es játékos győzött.");
        }
        if (result == SECOND) {
            System.out.print("A 2-es játékos győzött.");
        }
        if (result == DRAW) {
            System.out.print("Döntetlen!");
        }
    }
  }
