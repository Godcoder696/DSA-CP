package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class Subsequences {
    static void getSubsequences(ArrayList<String> sol, String input, int i, String str) {
        int n = input.length();

        if (i == n) {
            sol.add(str);
            return;
        }

        // take
        getSubsequences(sol, input, i + 1, str + input.charAt(i));

        // not take
        getSubsequences(sol, input, i + 1, str);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your sequence: ");
        String input = sc.next();

        ArrayList<String> sol = new ArrayList<>();

        getSubsequences(sol, input, 0, "");

        System.out.println("All subsequences are: " + sol);
    }
}
