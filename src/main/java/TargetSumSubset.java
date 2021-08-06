import java.util.HashSet;
import java.util.StringTokenizer;

public class TargetSumSubset {
	public static void main(String[] args) {
		int[] arr = {1, 3, 4, 5, 7, 9};
		int target = 16;
		 printTargetSumSubset(arr,0, "", 0,target);
		//printTargetSumSubset(arr, arr.length, target);
	}

	private static HashSet<String> allSubsets = new HashSet<>();

	/**
	 * The String token
	 */
	private static final String token = " ";

	/**
	 * The method for finding the subsets that sum to a target.
	 *
	 * @param input  The input array to be processed for subset with particular sum
	 * @param target The target sum we are looking for
	 * @param ramp   The Temporary String to be beefed up during recursive iterations(By default value an empty String)
	 * @param index  The index used to traverse the array during recursive calls
	 */
	public static void findTargetSumSubsets(int[] input, int target, String ramp, int index) {

		if(index > (input.length - 1)) {
			if(getSum(ramp) == target) {
				allSubsets.add(ramp);
			}
			return;
		}

		//First recursive call going ahead selecting the int at the currenct index value
		findTargetSumSubsets(input, target, ramp + input[index] + token, index + 1);
		//Second recursive call going ahead WITHOUT selecting the int at the currenct index value
		findTargetSumSubsets(input, target, ramp, index + 1);
	}

	/**
	 * A helper Method for calculating the sum from a string of integers
	 *
	 * @param intString the string subset
	 * @return the sum of the string subset
	 */
	private static int getSum(String intString) {
		int sum = 0;
		StringTokenizer sTokens = new StringTokenizer(intString, token);
		while (sTokens.hasMoreElements()) {
			sum += Integer.parseInt((String) sTokens.nextElement());
		}
		return sum;
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
