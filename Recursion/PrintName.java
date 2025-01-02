package Recursion;

public class PrintName {

    static void printNameNTimes(int n, String name) {
        if (n == 0)
            return;

        System.out.println("Printing " + name + " for " + n + "th time!");
        printNameNTimes(n - 1, name);
    }

    public static void main(String[] args) {
        printNameNTimes(50, "Lakshay");
    }
}