public class MaxProductArray {
    public static void main(String[] args) {
        int[] arr = {-1, 2, -3, 4, -9, 0, 5};
        int maxEnding = 0, minEnding = 0,maxSoFar = 0;
        System.out.println("val"+"\t"+"maxEnding" +"\t" + "minEnding" +"\t"+ "maxSoFar");
        for (int i : arr) {
            int temp = maxEnding;
            maxEnding = Integer.max(i, Integer.max(i * maxEnding, i * minEnding));
            minEnding = Integer.min(i, Integer.min(i * temp, i * minEnding));
            maxSoFar = Integer.max(maxSoFar, maxEnding);
            System.out.println(i+ "\t"+maxEnding +"\t\t\t" + minEnding +"\t\t\t"+ maxSoFar);
        }
        System.out.print("The maximum product of a subarray is " + maxSoFar);
    }
}
