public class MinMaxNumber {
	public static void main(String[] args) {
		int[] arr = {6,4,8};
		System.out.println(minMaxNumber(arr,2));
	}
	public static int minMaxNumber(int[] arr, int m) {
		int left = 0;
		int right = 0;
		for(int num: arr) {
			left = Math.max(num,left);
			right += num;
		}
		while(left < right) {
			int mid = (right - left) / 2 + left;
			int pieces = 1;
			int sum = 0;
			for(int num: arr) {
				if(sum + num > mid) {
					sum = num;
					pieces++;
				} else {
					sum += num;
				}
			}
			if(pieces > m) {
				left = mid + 1;
			}else{
				right = mid;
			}
		}
		return left;
	}
	
}