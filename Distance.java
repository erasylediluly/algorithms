import java.util.*;
public class Distance {
	public static void main(String[] args) {
		//String[] arr = {"dose","sole","gone","sone","sun","fale","sale","super"};
		//distance("done","done","sale",arr, new ArrayList<String>());
		String[] arr = {"hot","dot","dog","lot","log","cog"};
		System.out.println(distance("hit","hit","cog",arr, new ArrayList<String>()));

	}
	public static int distance(String start2,String start, String target,String[] array,ArrayList<String> list) {
		if(target.equals(start2)) {
			return list.size();
			
		}
		String copy = start;
		list.add(start);
		for(int i = 0; i < start.length(); i++) {
			for(int j = 0; j < 26; j++) {
				start = copy.substring(0,i)+(char)(j+'a') + copy.substring(i+1,start.length());
				if(contains(array, start) && !start.equals(copy) && !list.contains(start)){
					return distance(copy,start, target,array,list);
				}
			}
		}
		return 0;
	}
	public static boolean contains(String[] array, String s) {
		for(int i = 0; i < array.length; i++) {
			if((array[i]).equals(s)){
				return true;
			}
		}
		return false;
	}
}