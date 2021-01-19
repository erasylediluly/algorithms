import java.util.*;
public class Median {
	public static void main(String[] args) {
		int[] a1= {6,17,20};
		int[] a2 = {5,8,14,16,20,22};
		System.out.println(median(a1));
		System.out.println(median(a2));
	}
	public static int median(int[] arr) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i = 0; i < arr.length; i++) {
			if(maxHeap.isEmpty() || maxHeap.peek() > arr[i]) maxHeap.add(arr[i]);  //{5,8,14,16,20,22};
			else minHeap.add(arr[i]);
			if(maxHeap.size() > minHeap.size()+1) minHeap.add(maxHeap.poll());
			else if(minHeap.size() > maxHeap.size() + 1) maxHeap.add(minHeap.poll());
		}
		if(maxHeap.size() == minHeap.size()) {
			if(maxHeap.isEmpty()) return 0;
			else return (maxHeap.peek()+minHeap.peek())/2;
		}
		else{
			if(maxHeap.size() > minHeap.size()) return maxHeap.peek();
			else return minHeap.peek();
		}
	} 
}