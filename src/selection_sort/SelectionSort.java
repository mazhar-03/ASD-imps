package selection_sort;

import static selection_sort.Swap.swap;

public class SelectionSort {
    public static int[] selectionSort(int[] arr, int len){
        int i = 0;
        while(i <len){
            int i_min = i;
            int j = i + 1;
            while(j<len){
                if(arr[j] < arr[i_min])
                    i_min = j;
                j++;
            }
            swap(arr,i, i_min);
            i++;
        }
        return arr;
    }
}
