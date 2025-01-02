package Recursion;

public class CheckPalindrome {
    static boolean checkPalindrome(String tc, int i) {
        int n = tc.length();

        if (i >= n / 2)
            return true;

        if (!(tc.charAt(i) + "").equalsIgnoreCase(tc.charAt(n - i - 1) + ""))
            return false;

        return checkPalindrome(tc, i + 1);
    }

    public static void main(String[] args) {
        String tc = "MaDam";

        System.out.println("String is Palindrome: " + checkPalindrome(tc, 0));
    }
}
