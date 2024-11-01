package skipping_algorithm;

public class JumpSearch {
    public static int jumpSearch(int[] arr, int len, int key){
        int n = (int)(Math.floor(Math.sqrt(len)));
        int step = n;
        int prev = 0;

        while(arr[Math.min(step, len) - 1] < key){
            prev= step;
            step += n;
            if(prev >= len) return -1;
        }

        while(arr[prev]< key){
            prev++;
            if(prev == Math.min(step,len)) return -1;
        }

        if(arr[prev] == key) return prev;

        return -1;
    }
}
