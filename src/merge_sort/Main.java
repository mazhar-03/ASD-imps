package merge_sort;
public class Main {
    public static void main(String[] args) {
        int[] arr = {92, 76, 42, 68, 24, 75, 55, 67};
        PrintArray.print(MergeSort.mergeSort(arr, 0, arr.length -1));
    }
}
