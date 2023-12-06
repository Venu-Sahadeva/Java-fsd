
public class ExponentialSearch {
	    public static int exponentialSearch(int[] array, int target) {
	        int n = array.length;

	        if (array[0] == target) {
	            return 0; // Target found at the first element
	        }

	        int i = 1;
	        while (i < n && array[i] <= target) {
	            i *= 2;
	        }

	        return binarySearch(array, target, i / 2, Math.min(i, n - 1));
	    }

	    public static int binarySearch(int[] array, int target, int left, int right) {
	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Target found
	            } else if (array[mid] < target) {
	                left = mid + 1; // Discard the left half
	            } else {
	                right = mid - 1; // Discard the right half
	            }
	        }

	        return -1; // Target not found
	    }

	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int target = 7;

	        int result = exponentialSearch(array, target);

	        if (result != -1) {
	            System.out.println("Element found at index " + result);
	        } else {
	            System.out.println("Element not found in the array");
	        }
	    }
	}

