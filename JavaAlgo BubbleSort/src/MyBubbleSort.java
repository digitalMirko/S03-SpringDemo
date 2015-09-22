/* Bubble Sort program in Java
 * 
 * Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list
 * to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong
 * order. The pass through the list is repeated until no swaps are needed, which indicates that
 * the list is sorted.
 *  
 * The algorithm gets its name from the way smaller elements bubble to the top of the list. Because
 * it only uses comparisons to operate on elements, it is a comparison sort. 
 */

public class MyBubbleSort {
		// logic to sort the elements
		public static void bubble_srt(int array[]){
			int n = array.length;
			int k;
			for(int m = n; m >= 0; m--) {
				for(int i = 0; i < n - 1; i++){
					k = i + 1;
					if(array[i] > array[k]){
						swapNumbers(i, k, array);
					}
				}
				printNumbers(array);
			}
		}
		private static void swapNumbers(int i, int j, int[] array){
			int temp;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		private static void printNumbers(int[] input) {
			
			for(int i = 0; i < input.length; i++){
				System.out.print(input[i] + ", ");
			}
			System.out.println("\n");
		}
		
		public static void main(String[] args) {
			int[] input = {4, 2, 9, 6, 23, 12, 34, 0, 1};
			bubble_srt(input);
		}
	}

	/* Output:
	2, 4, 6, 9, 12, 23, 0, 1, 34, 

	2, 4, 6, 9, 12, 0, 1, 23, 34, 

	2, 4, 6, 9, 0, 1, 12, 23, 34, 

	2, 4, 6, 0, 1, 9, 12, 23, 34, 

	2, 4, 0, 1, 6, 9, 12, 23, 34, 

	2, 0, 1, 4, 6, 9, 12, 23, 34, 

	0, 1, 2, 4, 6, 9, 12, 23, 34, 

	0, 1, 2, 4, 6, 9, 12, 23, 34, 

	0, 1, 2, 4, 6, 9, 12, 23, 34, 

	0, 1, 2, 4, 6, 9, 12, 23, 34, 
	 
	*/