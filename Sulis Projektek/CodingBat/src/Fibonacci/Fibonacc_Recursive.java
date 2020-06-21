package Fibonacci;



import java.util.Scanner;

public class Fibonacc_Recursive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A Fibonacci-számsorozatot meddig írjam ki? ");
        fiboPrint(0, 1, sc.nextInt());
    }

    public static long fib(long n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    //Fiboncci kiíratásssal
    public static void fiboPrint(int n1, int n2, int index) {
        int fibNumber = n1 + n2;
        if (fibNumber < index) {
            System.out.print(fibNumber + " ");
            fiboPrint(n2, fibNumber, index);
        }
    }
}
