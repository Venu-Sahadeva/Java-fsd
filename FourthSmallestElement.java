
import java.util.Arrays;
public class FourthSmallestElement {

	public static int findFourthSmallest(int[] array) {
		  if (array.length < 4) {
	            System.out.println("Array size should be at least 4.");
	            return -1; // Invalid case
	        }

	        // Sort the array in ascending order
	        Arrays.sort(array);

	        // Return the fourth smallest element
	        return array[3];
	    }

	    public static void main(String[] args) {
	        int[] unsortedArray = {10, 5, 8, 2, 7, 3, 1, 6, 9, 4};

	        int fourthSmallest = findFourthSmallest(unsortedArray);

	        if (fourthSmallest != -1) {
	            System.out.println("The fourth smallest element is:" + fourthSmallest);
	        

	        }
	        
	    }

}