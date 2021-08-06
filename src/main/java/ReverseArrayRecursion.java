class ReverseArrayRecursion {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		printArray(arr,0);
		System.out.println();
		reverseArray(arr, 0);
	}

	static void reverseArray(int[] arr, int index) {
		if (index == arr.length) {
			return;
		}
		reverseArray(arr, index + 1);
		System.out.print(arr[index] + " ");
	}

	static void printArray(int[] arr, int index ) {
		if (index == arr.length) {
			return;
		}
		System.out.print(arr[index] + " ");
		printArray(arr, index + 1);
	}
}
