package Fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 10;
        int fib;
        for (int i = a; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
            System.out.println(fib);
        }
    }
}