
public class MergeSort {
	public static void mergeSort(int[] array) {
        int n = array.length;

        if (n > 1) {
            int mid = n / 2;

            // Split the array into two halves
            int[] left = new int[mid];
            int[] right = new int[n - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, n - mid);

            // Recursively sort the two halves
            mergeSort(left);
            mergeSort(right);

            // Merge the sorted halves
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int leftLength = left.length;
        int rightLength = right.length;

        // Merge left and right arrays back into the original array
        while (i < leftLength && j < rightLength) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Copy the remaining elements of left and right arrays, if any
        while (i < leftLength) {
            array[k++] = left[i++];
        }

        while (j < rightLength) {
            array[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
	

}

}
