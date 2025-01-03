package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubsequenceSum {
    public static void targetSum(int k, int arr[], int sum, int i, ArrayList<Integer> sumList) {
        int n = arr.length;

        if (sum == k) {
            System.out.println(sumList);
            return;
        } else if (i == n || sum > k) {
            return;
        }

        // not take
        targetSum(k, arr, sum, i + 1, sumList);

        // take
        sumList.add(arr[i]);
        targetSum(k, arr, sum + arr[i], i + 1, sumList);
        sumList.remove(sumList.get(sumList.size() - 1));
    }

    public static int countTargetSum(int k, int arr[], int sum, int i) {
        int n = arr.length;

        if (sum == k)
            return 1;
        if (i == n || sum > k)
            return 0;

        return countTargetSum(k, arr, sum + arr[i], i + 1) + countTargetSum(k, arr, sum, i + 1);
    }

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 1, 2 };
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter target sum: ");
        int k = sc.nextInt();

        // targetSum(k, arr, 0, 0, new ArrayList<>());

        System.out.println("Number of targeted subsequences: " + countTargetSum(k, arr, 0, 0));
    }
}
