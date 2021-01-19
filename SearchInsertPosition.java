public class SearchInsertPosition {
	public static void main(String[] args) {
		int[] arr = {12,56,78,123,456,4568};
		System.out.println(search(arr,56));
		System.out.println(search(arr,72));
	}
	public static int search(int[] arr, int target){
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int middle = (right-left)/2+left;
			if(arr[middle] == target) {
				return middle;
			}
			if(arr[middle] > target){
				right = middle-1;
			}
			else if(arr[middle] < target) {
				left = middle+1;
			}
		}
		return left;
	}
}