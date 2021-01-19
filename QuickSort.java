public class QuickSort {
	public static void main(String[] args) {
		int[]  arr = {5,2,3,8,4,6,2,8,6,4};		
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
	public static void quickSort(int[] arr,int low,int high) {
		if(low < high){
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low;
		for(int j  = low; j < high; j++) {
			if(arr[j] < pivot) {
				swap(arr,i,j);
				i++;
			}
		}
		swap(arr,i,high);
		return i;
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