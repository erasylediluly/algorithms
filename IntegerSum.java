public class IntegerSum{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sum(arr,5));
	}
	public static String sum(int[] arr, int target){
		int left = 0;
		int right = arr.length - 1;
		while(left <= right) {
			if(arr[left] + arr[right] == target) {
				return "[" + left +", " + right + "]";
			}
			if(arr[left] + arr[right] > target) {
				right--;
			}
			if(arr[left] + arr[right] < target) {
				left++;
			}
		}
		return "-1";
	}
}