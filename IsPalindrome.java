import java.util.*;
public class IsPalindrome {
	public static void main(String[] args){
		String s1 = "vneiwfewf";
		String s2 = "qwertytrewq";
		String s3 = "qwertyqtrewq";
		System.out.println(isPalindrome(s1));
		System.out.println(isPalindrome(s2));
		System.out.println(isPalindrome(s3));
	}
	public static boolean isPalindrome(String s){
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i = 0; i < s.length(); i++){
			if(!hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i),1);
			}
			else{
				int value = hm.get(s.charAt(i));
				value++;
				hm.put(s.charAt(i), value);
			}
		}
		int odds = 0;
		for(Character c: hm.keySet()){
			if((hm.get(c))%2 == 1){
				odds++;
			}
		}
		return odds == 1 || odds == 0;
	} 
}