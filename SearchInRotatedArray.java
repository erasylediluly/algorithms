public class SearchInRotatedArray{
	public static void main(String[] args) {
		int[] arr = {3,4,5,1,2};
		System.out.println(search(arr,1));
		System.out.println(search(arr,2));
		System.out.println(search(arr,3));
		System.out.println(search(arr,4));
		System.out.println(search(arr,1));
	}
	public static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int pivot = 0;
		while(left <= right) {
			int mid = (right - left)/2 + left;
			if(mid > left && arr[mid] < arr[mid-1]) {
				pivot = mid;
				break;
			}
			if(mid < right && arr[mid+1] < arr[mid]){
				pivot = mid+1;
				break;
			}
			if(arr[mid] > arr[left]) {
				left = mid+1;
			} 
			if(arr[mid] < arr[right]) {
				right = mid-1;
			}
		}
		int result1 =  binarySearch(arr,target,0,pivot);
		int result2 = binarySearch(arr,target,pivot,arr.length - 1);
		if(result1 != -1) {
			return result1;
		}
		if(result2 != -1) {
			return result2;
		}
		return -1;
	}
	public static int binarySearch(int[] arr, int target, int left, int right) {
		while(left <= right) {
			int middle = (right - left)/2+left;
			if(target == arr[middle]) {
				return middle;
			}
			if(arr[middle] > target) {
				right = middle-1;
			}
			if(arr[middle] < target) {
				left = middle+1;
			}
		}
		return -1;
	}
}