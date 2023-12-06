import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the element found is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        
        System.out.println("Original array: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}


