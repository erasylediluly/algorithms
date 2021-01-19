public class SelectionSort {
	public static void main(String[] args) {
		int[]  arr = {5,2,3,8,4,6,2,8,6,1};		
		selectionSort(arr);
		printArray(arr);
	}
	public static void selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			int min = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			System.out.println(min + ":" + i);
			swap(arr,i,min);
		}
	}
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}