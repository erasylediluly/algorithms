import java.util.*;
public class Permutation {
	public static void main(String[] args) {
		String s = "avasafefw";
		System.out.println(permutation(s, "avasafefw"));
	}
	public static boolean permutation(String s1, String s2){
		HashMap<Character, Integer> hm1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();
		if(s1.length() != s2.length()) return false;
		for(int i = 0; i < s1.length(); i++){
			if(!hm1.containsKey(s1.charAt(i))){
				hm1.put(s1.charAt(i), 1);
			}
			else{
				int value = hm1.get(s1.charAt(i));
				value++;
				hm1.put(s1.charAt(i), value);
			}
		}
		for(int i = 0; i < s2.length(); i++){
			if(!hm2.containsKey(s2.charAt(i))){
				hm2.put(s2.charAt(i), 1);
			}
			else{
				int value = hm2.get(s1.charAt(i));
				value++;
				hm2.put(s2.charAt(i), value);
			}
		}
		return hm1.equals(hm2);
	}
}