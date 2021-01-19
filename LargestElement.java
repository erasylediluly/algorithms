import java.util.*;
public class LargestElement {
	public static void main(String[] args) {
		int[] arr1 = {5,1,8};
		int[] arr2 = {8,15,2,41,5,6,13};
		int[] arr3 = {2,4,2,2,3};
		System.out.println(largestElement(arr1,2));
		System.out.println(largestElement(arr2,3));
		System.out.println(largestElement(arr3,3));
	}
	public static int largestElement(int[] arr, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		System.out.println(pq);
		for(int i = 0; i < n-1; i++) {
			pq.poll();
		}
		return pq.peek();
	}
}