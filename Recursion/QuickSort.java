package Recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class QuickSort {

    public static int findPivot(int l, int r, int[] input) {
        int pivot = input[l];
        int i = l, j = r;

        while (i < j) {
            while (i <= r - 1 && pivot >= input[i])
                i++;
            while (j >= l + 1 && pivot < input[j])
                j--;

            if (i < j)
                swap(i, j, input);
        }

        swap(l, j, input);

        return j;
    }

    public static void swap(int i, int j, int arr[]) {
        int s = arr[i];
        arr[i] = arr[j];
        arr[j] = s;
    }

    public static void sort(int l, int r, int[] input) {
        if (l < r) {
            int pivot = findPivot(l, r, input);

            sort(l, pivot - 1, input);
            sort(pivot + 1, r, input);
        }
    }

    public static void main(String[] args) {
        int[] input = new int[] { 4, 6, 2, 5, 7, 9, 1, 3 };

        sort(0, input.length - 1, input);

        System.out.println("Sorted array: ");
        for (int i : input) {
            System.out.print(i + " ");
        }

        Set<List<Integer>> set = new HashSet<>();

    }
}
