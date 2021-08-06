public class MaxDiffBetweenAdjacentElement {

    public static void main(String[] args) {
        int[] arr = {1,-2,7,4,5,6};
        int minElement = arr[0];
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - minElement > diff){
                diff = arr[i]-minElement;
            }else{
                minElement=arr[i];
            }
        }
        System.out.println(diff);
    }
}
