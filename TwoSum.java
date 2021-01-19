import java.util.*;
public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		System.out.println(twoSum(arr, 18));
	}
	public static String twoSum(int[] arr, int target){
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		String s = "";
		for(int i = 0; i < arr.length; i++){
			int d = target - arr[i];
			if(!hm.containsKey(d)){
				hm.put(arr[i],i);
			}
			else{
				s += i + " ";
				s += hm.get(d) + " ";
			}
		}
		return s;
 	}
}