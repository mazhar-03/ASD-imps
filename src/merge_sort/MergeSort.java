package merge_sort;

public class MergeSort {
    public static int[] mergeSort(int[] arr, int l, int r){
        if(l<r){
            int m = Math.floorDiv((l + r), 2);
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
        return arr;
    }
    private static void merge(int[] arr, int l, int m, int r){
        int[] arr1 = new int[m-l+1];
        int[] arr2 = new int[r-m];

        System.arraycopy(arr, l, arr1, 0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[m+1+i];
        }

        //merging into main array
        int i =0;
        int j =0;
        int k =l;

        while(i< arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            }else{
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        //if one of the array merge all numbers to the real one, we copy and paste the other ones to the end
        while(i < arr1.length){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
}
