class MergeSort {
    public static void main(String[] args) {
        int arr[] = new int[] { 2, 13, 4, 1, 3, 6, 28 };
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        // print sorted array
        for (int i : arr)
            System.out.print(" " + i);
    }

    public static void mergeSort(int[] arr, int l, int r) {

        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid); // left part
            mergeSort(arr, mid + 1, r); // right part

            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int m = mid - l + 1;
        int n = r - mid;

        int arr1[] = new int[m];
        int arr2[] = new int[n];

        for (int i = 0; i < m; i++)
            arr1[i] = arr[i + l];
        for (int i = 0; i < n; i++)
            arr2[i] = arr[i + mid + 1];

        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (arr1[i] > arr2[j]) {
                arr[k + l] = arr2[j];
                j++;
            } else if (arr1[i] <= arr2[j]) {
                arr[k + l] = arr1[i];
                i++;
            }
            k++;
        }

        while (i < m) {
            arr[k + l] = arr1[i];
            i++;
            k++;
        }

        while (j < n) {
            arr[k + l] = arr2[j];
            j++;
            k++;
        }
    }
}