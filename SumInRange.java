import java.util.Scanner;
public class SumInRange {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input size of the array
	        System.out.println("Enter the size of the array: ");
	        int n = scanner.nextInt();

	        // Input array elements
	        int[] array = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            array[i] = scanner.nextInt();
	        }

	        // Input range [L, R]
	        System.out.print("Enter the range L (0 <= L <= R <= n-1): ");
	        int L = scanner.nextInt();
	        System.out.println("Enter the range R: ");
	        int R = scanner.nextInt();

	        // Validate the input range
	        if (L < 0 || R < L || R >= n) {
	            System.out.println("Invalid range input.");
	            return;
	        }

	        // Calculate the sum of elements in the range [L, R]
	        int SumInRange = 0;
	        for (int i = L; i <= R; i++) {
	            SumInRange += array[i];
	        }
	        
	        System.out.println("Sum of elements in the range [" + L + ", " + R + "]: " +SumInRange);
	    }
	}



