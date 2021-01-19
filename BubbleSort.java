public class BubbleSort {
	public static void main(String[] args) {
		int[]  arr = {5,2,3,8,4,6,2,8,6,1};
		bubbleSort(arr);
		printArray(arr);
	}
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			boolean isSorted = true;
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = false;
				}
			}
			if(isSorted) {
				break;
			}
		}
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}