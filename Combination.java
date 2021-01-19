import java.util.*;
public class Combination {
	public static void main(String[] args) {
		combination("23");
	}
	public static void combination(String s) {
		String[] arr = new String[s.length()];
		for(int i = 0; i < s.length(); i++) {
			switch( s.charAt(i)){
				case '1':arr[i] = " "; break;
				case '2':arr[i] = "abc"; break;
				case '3':arr[i] = "def"; break;
				case '4':arr[i] = "ghi"; break;
				case '5':arr[i] = "jkl"; break;
				case '6':arr[i] = "mno"; break;
				case '7':arr[i] = "pqrs"; break;
				case '8':arr[i] = "tuv"; break;
				case '9':arr[i] = "wxyz"; break;
			}
		}
		combination("",arr);
	}
	public static void combination(String prefix, String[] arr){
		if(prefix.length() >= arr.length) {
			System.out.println(prefix);
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++){
				if(!contains(prefix,arr[i])){
				combination(prefix + arr[i].charAt(j),arr);}
			}
		}
	}
	public static boolean contains(String prefix, String arri) {
		for(int i = 0; i < arri.length(); i++) {
			for(int j = 0; j < prefix.length(); j++) {
				if(arri.charAt(i) == prefix.charAt(j)){
					return true;
				}
			}
		}
		return false;
	}
}