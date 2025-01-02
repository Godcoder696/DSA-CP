package Recursion;

import java.util.Scanner;

public class FibonacciNumber {

    static int getFibNumber(int n) {
        if (n <= 1)
            return n;

        return (getFibNumber(n - 1) + getFibNumber(n - 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter fibonacci number to print: ");
        int input = sc.nextInt();
        int num = getFibNumber(input - 1);

        System.out.println(input + "th Fibonacci Number is: " + num);
    }
}
