import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 12, 3};
        Arrays.sort(arr);
        System.out.println(BinarySearch.indexOf(arr, 10));
    }

    public static int indexOf(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
