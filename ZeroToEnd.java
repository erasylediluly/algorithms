import java.util.*;
public class ZeroToEnd {
	public static void main(String[] args) {
		int[] arr = {0,1,0,3,12};
		moveZeroes(arr);
	}
	public static void moveZeroes(int[] arr){
		int main = 0;
		int none = -1;
		while(main < arr.length){
			if(arr[main] == 0){
				if(none == -1){
					none += main+1; 
				}
				while(none < arr.length && arr[none] == 0){
					none++;
				}
				if(none < arr.length){
					int temp = arr[none];
					arr[none] = arr[main];
					arr[main] = temp;
				}
			}
			main++;
		}
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + ", ");
		}
	}
}