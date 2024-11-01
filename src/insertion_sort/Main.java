package insertion_sort;
import merge_sort.PrintArray;

public class Main {
    public static void main(String[] args) {
        int[] arr = {92, 76, 42, 68, 24, 75, 55, 67};
        PrintArray.print( InsertionSort.insertionSort(arr, arr.length) );
    }
}
