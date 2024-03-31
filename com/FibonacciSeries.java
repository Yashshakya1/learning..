package learning.com;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt();
        System.out.println("Fibonacci series up to " + limit + " terms:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < limit; i++) {
            int next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
        scanner.close();
    }
}
