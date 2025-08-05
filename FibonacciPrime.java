package progs;

public class FibonacciPrime {

    public static void main(String[] args) {
        int a = 0, b = 1, c;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= 20; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }

        System.out.println("\n\nPrime Numbers in Fibonacci Series:");
        a = 0;
        b = 1;
        for (int i = 1; i <= 20; i++) {
            if (isPrime(a)) {
                System.out.print(a + " ");
            }
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}