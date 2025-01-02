package Recursion;

import java.util.ArrayList;

public class ReverseArray {

    static void reverseArray(ArrayList<Integer> arr, int i) {
        int n = arr.size();

        if (i >= n / 2)
            return;

        swap(i, n - i - 1, arr);

        reverseArray(arr, i + 1);
    }

    static void swap(int i, int j, ArrayList<Integer> arr) {
        int s = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, s);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);

        reverseArray(arr, 0);

        System.out.println("Reversed Array: " + arr);
    }
}
