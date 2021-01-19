public class PeakElement {
	public static void main(String[] args) {
		int[] arr = {4,2,5,6,8,3,1};
		System.out.println(peakElement(arr));
	}
	public static int peakElement(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left <= right) {
			int mid = (right - left) / 2 + left;
			if(left == right) {
				return mid;
			}
			if(arr[mid] > arr[mid+1]){
				right = mid;
			}
			if(arr[mid] < arr[mid + 1]) {
				left = mid + 1;
			}
		}
		return -1;
	}
}