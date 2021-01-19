import java.util.*;
public class Difference {
	public static void main(String[] args) {
		difference(50,199,3);
	}
	public static void difference(int L, int R, int k) {
		String s = "123456789";
		String[] arr = new String[(R+"").length()];
		for(int i = 0; i < (R+"").length(); i++) {
			arr[i] = s;
		}
		difference("",arr,L,R,k);
	} 
	public static void difference(String prefix, String[] arr,int L, int R, int k) {
		if(prefix.length()>=arr.length) {
			System.out.println(prefix);
			return;	
		}
		if((prefix != "" && Integer.parseInt(prefix) > R) || (prefix != "" && Integer.parseInt(prefix) < L)) {
			return;
		}
		if(prefix != "" && Integer.parseInt(prefix) >= L && Integer.parseInt(prefix) <= R) {
			System.out.println("result: "  + prefix);
			return;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length(); j++){
				//if(prefix == "" || (Math.abs(Character.getNumericValue(prefix.charAt(prefix.length()-1))-Character.getNumericValue(arr[i].charAt(j)))) == k){
					prefix = prefix + arr[i].charAt(j);
					difference(prefix,arr,L,R,k);
				//}
			}
		}
	}
}

/*
		5          6             7
	   / \      /     \         /
	  52  58   63      69      74  
	 /   /    /  \    /       /  \
   525  585  630 636 696     747 741
*/