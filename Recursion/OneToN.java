package Recursion;

public class OneToN {

    public static void printOneToN(int start, int end) {
        System.out.println(start);
        if (start == end)
            return;
        printOneToN(start + 1, end);
    }

    public static void printNToOne(int start, int end) {
        System.out.println(start);
        if (start == end)
            return;
        printNToOne(start - 1, end);
    }

    public static void main(String[] args) {
        // printOneToN(1, 30);
        printNToOne(30, 1);
    }
}
