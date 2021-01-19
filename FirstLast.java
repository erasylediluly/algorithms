public class FirstLast {
	public static void main(String[] args) {
		int[] arr = {1,2,3,5,5,6,8};
		System.out.println(first(arr,5));
		System.out.println(last(arr,5));
	}
	public static int first(int[] arr, int target){
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int middle = (right-left)/2+left;
			if(middle == 0 || target > arr[middle - 1] && arr[middle] == target) {
				return middle;
			}
			if(arr[middle] < target) {
				left = middle+1;
			}
			if(arr[middle] >= target){
				right = middle-1;
			}
		}
		return -1;
	}
	public static int last(int[] arr, int target){
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int middle = (right-left)/2+left;
			if(middle == (arr.length-1) || target < arr[middle + 1] && arr[middle] == target) {
				return middle;
			}
			if(arr[middle] > target){
				right = middle-1;
			}
			else if(arr[middle] <= target) {
				left = middle+1;
			}
		}
		return -1;
	}
}