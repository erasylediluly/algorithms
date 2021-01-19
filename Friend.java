public class Friend{
	public static void main(String[] args) {
		int[] arr = {6,3,2,8,7,5};
		System.out.println(friend(arr,2));
	}
	public static int friend(int[] arr, int k){
		int right = 0;
		for(int i = 0; i < arr.length; i++) {
			right += arr[i];
		}
		int left = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < left) {
				left = arr[i];
			}
		}
		System.out.println(left + ": " + right);
		while(left < right) {
			int slice = 0;
			int sum = 0;
			int mid = (right - left + 1)/2 + left;
			for(int i = 0; i < arr.length; i++) {
				sum += arr[i];
				if(sum > mid) {
					slice++;
					sum = 0;
					if(slice > k){
						break;
					}
				}
			}
			if(slice > k) {
				left = mid + 1;
			}
			else{
				right = mid;
			}
		}
		return left;
	}

}