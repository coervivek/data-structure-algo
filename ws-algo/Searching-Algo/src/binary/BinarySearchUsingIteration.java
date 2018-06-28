package binary;

public class BinarySearchUsingIteration {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 10, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

	private static int binarySearch(int[] arr, int left, int right, int k) {

		while (left <= right) {
			int mid = (left + right) / 2;

			if (arr[mid] < k) {
				left = mid + 1;
			} else if (arr[mid] > k) {
				right = mid - 1;
			} else {
				return mid;
			}

		}
		return -1;
	}

}
