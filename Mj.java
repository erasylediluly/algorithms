public class Mj{
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {1,2,2,2,3,2,1,1,4,1,2,2,2,2,2,2}));
    }
    public static int majorityElement(int[] arr) {
        return majorityElement(arr,0,arr.length - 1);
    }
    public static int majorityElement(int[] arr,int lo, int hi) {
        if(lo == hi ) {
            return arr[lo];
        }
        int mid = (hi - lo) / 2 + lo;
        int left = majorityElement(arr,lo,mid);
        int right = majorityElement(arr,mid+1,hi);
        if(left == right) {
            return left;
        }
        int leftCount = countInRange(arr,left,lo,hi);
        int rightCount = countInRange(arr,right, lo ,hi);
        return leftCount>rightCount ? left:right;
    }
    public static int countInRange(int[] arr, int num, int lo, int hi) {
        int result = 0;
        for(int e: arr) {
            if(e == num) {
                result++;
            }
        }
        return result;
    }
}