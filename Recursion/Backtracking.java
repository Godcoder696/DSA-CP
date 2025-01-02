package Recursion;

public class Backtracking {
    static int printOneToN(int n) {
        if (n == 1)
            return 1;

        System.out.println(printOneToN(n - 1));

        return n;
    }

    static int printNToOne(int start, int end) {
        if (start == end)
            return start;

        System.out.println(printNToOne(start + 1, end));

        return start;
    }

    public static void main(String[] args) {
        // printOneToN(10);
        printNToOne(0, 20);
    }
}
