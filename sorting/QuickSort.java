public class QuickSort {

    public static void main(String[] args) {
        int input[] = new int[] { 4, 6, 2, 5, 7, 9, 1, 3 };
        int n = input.length;

        quickSort(input, 0, n - 1);

        // print sorted array
        for (int i : input)
            System.out.print(" " + i);
    }

    public static void quickSort(int[] input, int startIndex, int endIndex) {

        if (startIndex < endIndex) {

            int pivot = partition(input, startIndex, endIndex);

            quickSort(input, startIndex, pivot - 1); // left part excluding pivot
            quickSort(input, pivot + 1, endIndex); // right part excluding pivot
        }

    }

    public static int partition(int[] input, int low, int high) {

        int pivot = input[low];
        int i = low, j = high;

        while (i < j) {

            while (input[i] <= pivot && i < high)
                i++;
            while (input[j] > pivot && j > low)
                j--;

            if (i < j) {
                swap(input, i, j);
            }
        }

        swap(input, low, j);

        return j;
    }

    public static void swap(int[] input, int i, int j) {
        int swap = input[i];
        input[i] = input[j];
        input[j] = swap;
    }
}
