import java.util.Comparator;

public class InsertionSort {

    public static void main(String[] args) {
       // String[] a = {"Ram", "Shyam", "Pascal", "ABC"};
        Integer[] a= {4,3,5,2,7,1};
        InsertionSort.sort(a);
        show(a);
    }


    public static void sort(Comparable[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0 &&   a[j].compareTo(a[j-1]) < 0; j--) {
                Object swap = a[j];
                a[j] = a[j-1];
                a[j-1] = (Comparable) swap;
            }
        }
    }



    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }


    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i < hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private static boolean isSorted(Object[] a, Comparator<Object> comparator) {
        return isSorted(a, 0, a.length, comparator);
    }

    private static boolean isSorted(Object[] a, int lo, int hi, Comparator<Object> comparator) {
        for (int i = lo + 1; i < hi; i++)
            if (less(a[i], a[i-1], comparator)) return false;
        return true;
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static boolean less(Object v, Object w, Comparator<Object> comparator) {
        return comparator.compare(v, w) < 0;
    }

    private static void show(Comparable[] a) {
        for (Comparable comparable : a) {
            System.out.println(comparable);
        }
    }

}