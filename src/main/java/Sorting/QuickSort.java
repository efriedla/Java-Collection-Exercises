package Sorting;
import java.util.Arrays;
public class QuickSort {

	//Global Variables where we can call and keep state throughout class
	private int temp_array[];
	private int len;

	/**
	 * Checks if array is empty or null
	 * gets the starting and ending indexs
	 * @param nums int Array
	 */
	public void sort(int[] nums) {
		if (nums == null || nums.length == 0) {
			return;
		}
		this.temp_array = nums;
		len = nums.length;
		quickSort(0, len - 1);
	}

	/**
	 * takes in the left and right index of the array
	 * @param low_index
	 * @param high_index
	 */
	private void quickSort(int low_index, int high_index) {
		System.out.println( temp_array[low_index] +" quickSort!!! " + temp_array[high_index]);
		int i = low_index;
		int j = high_index;
		// calculate pivot number
		int pivot = temp_array[low_index+(high_index-low_index)/2]; //the action of turning around a point
		// Divide into two arrays
		while (i <= j) { // while left is less than right
			while (temp_array[i] < pivot) {
				i++;
			}
			while (temp_array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				System.out.println( temp_array[i] +" Switch!!! " + temp_array[j]);
				exchangeNumbers(i, j);
				System.out.println( Arrays.toString(temp_array));
				//move index to next position on both sides
				i++;
				j--;
			}
		}
		// call quickSort() method recursively
		if (low_index < j)
			quickSort(low_index, j);
		if (i < high_index)
			quickSort(i, high_index);
	}

	private void exchangeNumbers(int i, int j) {
		int temp = temp_array[i];
		temp_array[i] = temp_array[j];
		temp_array[j] = temp;
	}

	// Method to test above
	public static void main(String args[])
	{
		QuickSort ob = new QuickSort();
		int nums[] = {7, -5, 3, 2, 11, 0, 45};
		System.out.println("Original Array:");
		System.out.println(Arrays.toString(nums));
		ob.sort(nums);
		System.out.println("Sorted Array");
		System.out.println(Arrays.toString(nums));
	}
}
