import java.util.*;
public class TopKFrequent {
	public static void main(String[] args) {
		int[] a = {3,6,1,2,7,6,8,3};
		System.out.println(topKFrequent(a, 3));
	}
	public static ArrayList<Integer> topKFrequent(int[] nums, int k) {
		ArrayList<Integer> result = new ArrayList<>();
		PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length; i++) {
			if(!map.containsKey(nums[i])) {
				map.put(nums[i],1);
			}
			else {
				int value = map.get(nums[i]);
				value++;
				map.put(nums[i], value);
			}
		}
		for(int i: map.keySet()) {
			Pair current = new Pair(i, map.get(i));
			pq.add(current);
		}
		for(int i = 0; i < k; i++) {
			result.add((pq.poll()).first);
		}
		return result;
	}
	private class Pair implements Comparable<Pair>{
		int first;
		int second;
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
		public int compareTo(Pair o) {
			if(this.second > o.second) {
				return 1;
			}
			else if(this.second == o.second) {
				return 0;
			}
			else{
				return -1;
			}
		}
		public String toString() {
			return first + ": " + second;
		}
	}
}
}