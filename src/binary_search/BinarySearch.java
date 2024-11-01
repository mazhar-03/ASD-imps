package binary_search;

public class BinarySearch {
    public static int search(int[] arr, int len, int key){
        int l = 0;
        int r = len - 1;

        while(l <= r){
            int m = Math.floorDiv((l+r),2);
            if(arr[m] == key) return m;
            else{
                if(arr[m] > key) r = m -1;
                else l = m+ 1;
            }
        }
        return -1;
    }
}
