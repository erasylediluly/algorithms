public class GenerousFriend {
	public static void main(String[] args) {
		int[] arr = {6,3,2,8,7,5};
		System.out.println(friend(arr,2));
	}
	public static int friend(int[] arr, int k) {
		int left = 1;
		int right = Integer.MAX_VALUE;
		while(left < right) {
			int mid = left + (right - left + 1) / 2;
			int slice = 0;
			int sum = 0;
			for(int s: arr) {
				sum += s;
				if(sum >= mid) {
					sum = 0;
					slice++;
					if(slice > k) break;
				}
			}
			if(slice > k) {
				left = mid;
			}
			else{
				right = mid - 1;
			}
		}
		return left;
	}
}