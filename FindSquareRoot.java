public class FindSquareRoot {
	public static void main(String[] args) {
		System.out.println(squareRoot(9));
	}
	public static int squareRoot(int n) {
		int left = 0;
		int right = n-1;
		while(left <= right) {
			int middle = (right - left)/2 + left;
			if(middle*middle == n) {
				return middle;
			}
			if(middle*middle < n) {
				left = middle+1;
			}
			else if(middle*middle > n) {
				right = middle-1;
			}
		}
		return -1;
	}
}