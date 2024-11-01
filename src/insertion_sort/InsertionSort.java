package insertion_sort;
import selection_sort.Swap;

import static selection_sort.Swap.swap;

public class InsertionSort {
    public static int[] insertionSort(int[] arr, int len){
        int i = 1;
        while(i < len){
            int j = i - 1;
            while(j >= 0 && (arr[j] > arr[j+1])){
                swap(arr, j, j+1);
                j--;
            }
            i++;
        }
        return arr;
    }
}
