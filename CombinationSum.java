public class CombinationSum {
	public static void main(String[] args) {
		sum(new int[] {1,2,3,5,6},6);		
	}
	public static void sum(int[] arr, int target) {
		String s = "";
		for(int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		sum("",s,target);
	}
	public static int sum(String s) {
		int sum = 0;
		for(int i = 0; i < s.length(); i++) {
			sum += Character.getNumericValue(s.charAt(i));
		}
		return sum;
	}
	public static void sum(String prefix, String s, int target) {
		if(sum(prefix) == target) {
			System.out.println(prefix);
			return;
		}
		if(sum(prefix) > target) {
			return;
		}
		for(int i = 0; i < s.length(); i++) {
			sum(prefix+s.charAt(i),s,target);
		}
	}
}