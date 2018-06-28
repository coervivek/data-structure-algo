package binary;

public class BinarySeachUsingRecursion {

	int binarySearch(int arr[], int left, int right, int x) {
		if (right >= left) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == x)
				return mid;

			if (arr[mid] > x) // left side
				return binarySearch(arr, left, mid - 1, x);
			// else find in right
			return binarySearch(arr, mid + 1, right, x);
		}

		return -1;
	}

	public static void main(String args[]) {
		BinarySeachUsingRecursion ob = new BinarySeachUsingRecursion();
		int arr[] = { 1, 2, 3, 4, 10, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = ob.binarySearch(arr, 0, n - 1, x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index " + result);
	}

}