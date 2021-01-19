import java.util.*;
public class IsUnique {
	public static void main(String[] args) {
		String s = "string";
		String t = "sstring";
		System.out.println(s + ":" + isUnique(s));
		System.out.println(t + ":" + isUnique(t));
		System.out.println(s + ":" + isUnique2(s));
		System.out.println(t + ":" + isUnique2(t));
	}
	//time:O(n);
	//space:O(n);
	public static boolean isUnique(String s1) {
		HashSet<Character> hs = new HashSet<>();
		for(int i = 0; i < s1.length(); i++) {
			if(hs.contains(s1.charAt(i))) {
				return false;
			}
			else{
				hs.add(s1.charAt(i));
			}
		}
		return true;
	}
	//time:O(logn*n);
	//space:O(1);
	public static boolean isUnique2(String s) {
		char[] array = s.toCharArray();
		Arrays.sort(array);
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] == array[i+1]){
				return false;
			}
		}
		return true;
	}
}