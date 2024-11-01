package skipping_algorithm;

import static binary_search.Main.getInts;

public class Main {
    public static void main(String[] args) {
        int[] arr = getInts();
        System.out.print("the index at: " + JumpSearch.jumpSearch(arr, arr.length, 5));
        System.out.println(" | Length: " + arr.length);
    }
}
