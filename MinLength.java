public class MinLength {
	public static void main(String[] args) {
		int[] arr = {2,3,1,2,4,3};
		System.out.println(minLength(arr,7));
	}
	public static int minLength(int[] arr, int s) {
		int left = 0;
		int sum = 0;
		int ans = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			while(sum >= s) {
				ans = Math.min(ans, i + 1 - left);
				sum -= arr[left++];
			}
		}
		return ans == Integer.MAX_VALUE ? 0:ans;
	} 
}