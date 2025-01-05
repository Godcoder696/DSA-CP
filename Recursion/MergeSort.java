package Recursion;

import java.util.ArrayList;

public class MergeSort {

    public static void merge(int arr[], int start, int end, int mid) {
        int i = start, j = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }

        while (i <= mid) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= end) {
            temp.add(arr[j]);
            j++;
        }

        for (int k = 0; k < temp.size(); k++)
            arr[k + start] = temp.get(k);
    }

    public static void sort(int arr[], int start, int end) {
        int mid = (start + end) / 2;

        if (start == end)
            return;

        sort(arr, start, mid);
        sort(arr, mid + 1, end);

        merge(arr, start, end, mid);

    }

    public static void main(String[] args) {
        int[] input = new int[] { 5, 4, 3, 2, 1, 0 };

        sort(input, 0, input.length - 1);

        System.out.println("Sorted Array: ");
        for (int i : input) {
            System.out.print(i + " ");
        }
    }
}
