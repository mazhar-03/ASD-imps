package skipping_algorithm;

import binary_search.BinarySearch;
import merge_sort.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 1,4, 7, 2,0, 65, 2, 5, 6,2, 2, 1, 56, 7, 4,9,0,2,5,8,4,23,12,3,16,16,12,1,5};
        MergeSort.mergeSort(arr, 0, arr.length-1);

        System.out.print("the index at: " + JumpSearch.jumpSearch(arr, arr.length, 5));
        System.out.println(" | Length: " + arr.length);
    }
}
