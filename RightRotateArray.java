
public class RightRotateArray {

	public static void main(String[] args) {
		 int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // Replace this with your array

	        int rotateSteps = 5;
	        rightRotateArray(array, rotateSteps);

	        // Print the rotated array
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }

	    private static void rightRotateArray(int[] arr, int steps) {
	        int length = arr.length;
	        steps = steps % length; // In case steps is greater than array length

	        // Create a temporary array to store rotated elements
	        int[] temp = new int[length];

	        // Copy elements to temp array with right rotation
	        for (int i = 0; i < length; i++) {
	            temp[(i + steps) % length] = arr[i];
	        }

	        // Copy elements back to the original array
	        System.arraycopy(temp, 0, arr, 0, length);
	}

}
