package Recursion;

public class SummationOfN {
    static void parameterized(int sum, int n) {
        if (n == 0) {
            System.out.println("Ans is: " + sum);
            return;
        }
        parameterized(sum + n, n - 1);
    }

    static int nonParameterized(int n) {
        if (n == 0)
            return 0;

        return n + nonParameterized(n - 1);
    }

    public static void main(String[] args) {
        parameterized(0, 10);

        // System.out.println("Ans is: " + nonParameterized(10));
    }
}
