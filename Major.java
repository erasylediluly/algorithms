public class Major {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,2,1,2,3,2,1,2,2,2};
        System.out.println(majorElement(arr));
    }
    public static int majorElement(int[] arr) {
        return majorElement(arr, 0, arr.length - 1);
    }
    public static int majorElement(int[] arr, int lo, int hi) {
        if(lo == hi) {
            return arr[lo];
        }
        int mid = (hi - lo) / 2 + lo;
        int left = majorElement(arr,lo,mid);
        int right = majorElement(arr,mid+1,hi);
        int leftCount = countInRange(arr,left,lo,hi);
        int rightCount = countInRange(arr,right,lo,hi);
        if(left == right) {
            return left;
        }
        return leftCount > rightCount ? left: right;
    }
    public static int countInRange(int[] arr, int num, int lo, int hi) {
        int result = 0;
        for(int i: arr) {
            if(i == num) {
                result++;
            }
        }
        return result;
    }
}