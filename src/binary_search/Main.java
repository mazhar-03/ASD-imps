package binary_search;

import merge_sort.MergeSort;
import merge_sort.PrintArray;

public class Main {
    public static void main(String[] args) {
        // TODO for that we need sorted array
        int[] arr = getInts();
        System.out.print("the index at: " + BinarySearch.search(arr, arr.length, 0b1000000));
        System.out.println(" | Length: " + arr.length);
    }
    public static int[] getInts() {
        int[] arr = new int[]{64, 1,4, 7, 2,0, 65, 2, 5, 6,2, 2, 1, 56, 7, 4,9,0,2,5,8,4,23,12,3,16,16,12,1,5};
        int[] sorted = MergeSort.mergeSort(arr, 0, arr.length-1);
        PrintArray.print(sorted);
        return sorted;
    }
}
