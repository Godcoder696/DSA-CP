package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsetSumI {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 3 };

        List<Integer> ans = new ArrayList<>();

        solve(arr, 0, 0, ans);

        System.out.println(ans);
    }

    public static void solve(int arr[], int i, int sum, List<Integer> ans) {

        int n = arr.length;
        if (i == n) {
            ans.add(sum);
            return;
        }

        solve(arr, i + 1, sum + arr[i], ans);
        solve(arr, i + 1, sum, ans);
    }
}