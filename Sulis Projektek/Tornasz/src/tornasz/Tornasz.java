/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tornasz;

import java.util.Scanner;

public class Tornasz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char table[] = {'x', 'x', 'x', 'x', ' ', 'o', 'o', 'o', 'o'};
        int[] move;
        boolean gameEnd;
        Scanner sc = new Scanner(System.in);
        do {
            drawTable(table);
            move = getValidMove(table, sc);
            makeMove(move, table);
            COUNTER++;
            gameEnd = gameEnd(table);
        } while (!gameEnd);
        drawTable(table);
        System.out.println("Gratulálok, vége a játéknak!");
    }

    public static void drawTable(char[] table) {
        System.out.println("Lépésszám: " + COUNTER);
        System.out.println("------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.print("|");
            System.out.print(table[i]);
        }
        System.out.println("|");
        System.out.println("------------------");
    }

    public static int[] getValidMove(char[] table, Scanner sc) {
        int from;
        int to;
        do {
            System.out.println("Melyik mezővel lépsz? (0-8)");
            from = sc.nextInt();
            if (from == -1) {
                System.exit(0);
            }
            System.out.println("Melyik mezőre lépsz? (0-8)");
            to = sc.nextInt();
            if (to == -1) {
                System.exit(0);
            }
            if (!goodMove(table, from, to)) {
                System.out.println("Érvénytelen lépés!");
            }
        } while (!goodMove(table, from, to));
        int move[] = {from, to};
        return move;
    }

    public static boolean goodMove(char[] table, int from, int to) {
        if (from > 8 || from < 0 || to < 0 || to > 8) {
            return false;
        }
        if (Math.abs(from - to) > 2) {
            return false;
        }
        if (table[to] == table[from]) {
            return false;
        }
        if (Math.abs(from - to) == 2) {
            int middle = (from + to) / 2;
            if (table[from] == table[middle]) {
                return false;
            }
        }
        return true;
    }

    public static void makeMove(int[] move, char[] table) {
        char a = table[move[1]];
        table[move[1]] = table[move[0]];
        table[move[0]] = a;
    }

    public static boolean gameEnd(char[] table) {
        boolean gameEnd = false;
        if (table[0] == 'o' && table[1] == 'o' && table[2] == 'o'
                && table[3] == 'o' && table[4] == ' ') {
            gameEnd = true;
        }
        return gameEnd;
    }

    public static int COUNTER = 0;
}
