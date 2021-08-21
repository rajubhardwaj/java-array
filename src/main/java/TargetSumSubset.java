import java.util.HashSet;
import java.util.StringTokenizer;

public class TargetSumSubset {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 7, 9};
		int target = 16;
		 printTargetSumSubset(arr,0, "", 0,target);
		//printTargetSumSubset(arr, arr.length, target);
	}



	// Using Recursion
	private static void printTargetSumSubset(int[] arr, int index, String subset, int sumOfSubset, int target) {
		if (index == arr.length) {
			if (sumOfSubset == target) {
				System.out.println(subset + " = " + target);
			}
			return;
		}
		printTargetSumSubset(arr, index + 1, subset + arr[index] + ",", sumOfSubset + arr[index], target);
		printTargetSumSubset(arr, index + 1, subset, sumOfSubset, target);
	}
}
