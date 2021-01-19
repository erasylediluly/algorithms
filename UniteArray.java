import java.util.*;
public class UniteArray {
	public static void main(String[] args) {
		int[][] array = {{0,4,10},{1,2,4},{1,6,11}};
		int[] result = uniteSortedArray(array);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ", ");
		}
		System.out.println();
	}
	public static int[] uniteSortedArray(int[][] array) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int size = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				pq.add(array[i][j]);
				size++;
			}
		}
		int[] result = new int[size];
		int counter = 0;
		while(!pq.isEmpty()) {
			result[counter] = pq.poll();
			counter++;
		}
		return result;
	}
}