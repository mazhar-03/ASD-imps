package quick_sort;

import merge_sort.PrintArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {92, 76, 42, 68, 24, 75, 55, 67};
        QuickSort.quickSort(arr, 0, arr.length-1);
        PrintArray.print(arr);
    }
}
