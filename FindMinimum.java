public class FindMinimum {
	public static void main(String[] args) {
		int arr1[] =  {5, 6, 1, 2, 3, 4}; 
        int n1 = arr1.length; 
        System.out.println("The minimum element is "+ findMin(arr1)); 
  
        int arr2[] =  {1, 2, 3, 4}; 
        int n2 = arr2.length; 
        System.out.println("The minimum element is "+ findMin(arr2)); 
  
        int arr3[] =  {1}; 
        int n3 = arr3.length; 
        System.out.println("The minimum element is "+ findMin(arr3)); 
  
        int arr4[] =  {1, 2}; 
        int n4 = arr4.length; 
        System.out.println("The minimum element is "+ findMin(arr4)); 
  
        int arr5[] =  {2, 1}; 
        int n5 = arr5.length; 
        System.out.println("The minimum element is "+ findMin(arr5)); 
  
        int arr6[] =  {5, 6, 7, 1, 2, 3, 4}; 
        int n6 = arr6.length; 
        System.out.println("The minimum element is "+ findMin(arr6)); 
  
        int arr7[] =  {1, 2, 3, 4, 5, 6, 7}; 
        int n7 = arr7.length; 
        System.out.println("The minimum element is "+ findMin(arr7)); 
  
        int arr8[] =  {2, 3, 4, 5, 6, 7, 8, 1}; 
        int n8 = arr8.length; 
        System.out.println("The minimum element is "+ findMin(arr8)); 
  
        int arr9[] =  {3, 4, 5, 1, 2}; 
        int n9 = arr9.length; 
        System.out.println("The minimum element is "+ findMin(arr9)); 
	}
	public static int findMin(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while(left <= right){
			if(left > right) {
				return arr[0];
			}
			if(left == right) {
				return arr[left];
			}
			int middle = (right - left)/2 + left;
			if(left < middle && arr[middle] < arr[middle-1]){
				return arr[middle];
			}
			if(right > middle && arr[middle] > arr[middle+1]){
				return arr[middle+1];
			}
			if(arr[middle] < arr[right]){
				right = middle - 1;
			}
			if(arr[middle] > arr[left]){
				left = middle + 1;
			}
		}
		return arr[0];

	}
}