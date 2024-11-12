package quick_sort;

public class QuickSort {
    public static void quickSort(int[] array, int left, int right){
        if(left >= right)
            return;

        int pivotIndex = partition(array, left, right);
        quickSort(array, left, pivotIndex-1);
        quickSort(array, pivotIndex+1, right);
    }

    private static int partition(int[] arr, int l, int r){
        int i = l + 1;
        int j = r;
        int m = arr[l]; // median or pivot

        do {
            // Move i to the right as long as elements are less than or equal to the pivot
            while (i < r && arr[i] <= m) {
                i++;
            }

            // Move j to the left as long as elements are greater than or equal to the pivot
            while (j > i && arr[j] >= m) {
                j--;
            }

            // Swap elements if i < j
            if (i < j) {
                swap(arr, i, j);
            }
        } while (i < j);

        if (arr[i] > m) {
            swap(arr, i - 1, l);
            return i - 1;
        } else {
            swap(arr, i, l);
            return i;
        }
    }
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
