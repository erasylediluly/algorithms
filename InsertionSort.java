public class InsertionSort {
	public static void main(String[] args) {
		int[]  arr = {5,2,3,8,4,6,2,8,6,1};		
		insertionSort(arr);
		printArray(arr);
	}
	public static void insertionSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]){
					swap(arr,j,j-1);
				}
				else{
					break;
				}
			}
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