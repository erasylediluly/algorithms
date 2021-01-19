import java.util.*;
public class Neighbors {
	public static void main(String[] args) {
		System.out.println(same(50,199,3));
	}
	public static ArrayList<Integer> same(int L, int R, int k) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = L; i <= R; i++) {
			if(check(i,k)) {
				list.add(i);
			}
		}
		return list;
	}
	public static boolean check(int num, int k) {
		String s = num+"";
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0; i < s.length(); i++) {
			list.add(Character.getNumericValue(s.charAt(i)));
		}
		for(int i = 0; i < list.size()-1; i++) {
			if(k != Math.abs(list.get(i)-list.get(i+1))) {
				return false;
			}
		}
		return true;
	} 
}
/*
     1     2     3      4      5      6      7     8     9
    /     /     /      / \    / \    / \    /     /     /
   4     5     6      7   1  8   2  3   9  4     5     6
  / \   / \   / \    /   /  /   /  /   /  / \   / \   / \
 7   1 2   8 3   9  4   4  5   5  6   6  1   7 8   2 3   9
*/