public class MSS {
    public static void main(String[] args) {
        int[] array = {3,-4,5,-2,-2,6,-3,5,-3,2};
        System.out.println(mss(new int[] {-1,0,-2}));
    }
    public static int mss(int[] array) {
        if(array.length == 1) return array[0];
        if(array.length == 2) {
            int max = Math.max(array[0], array[0] + array[1]);
            return Math.max(max,array[1]);
        }
        int left = 0;
        int right = array.length - 1;
        int mid = (right - left) / 2 + left+1;
        System.out.println(array);
        int leftMaxIndex = findMaxIndexLeft(array,left,mid);
        int rightMaxIndex = findMaxIndexRight(array, mid, right);
        
        return leftMaxIndex+rightMaxIndex;
    }
    public static int findMaxIndexLeft(int[] array, int left, int mid) {
        int[] result = new int[mid - left+1];
        result[result.length - 1] = array[mid];
        int max = result[result.length - 1];
        int maxIndex = result.length - 1;
        for(int i = result.length-2; i >= left; i--) {
            result[i] = array[i] + result[i+1];
            if(result[i] > max) {
                max = result[i];
                maxIndex = i;
            }
        }
        return max;
    }
    public static int findMaxIndexRight(int[] array, int mid, int right) {
        if(right == mid) {
            return 0;
        }
        int[] result = new int[right - mid];
        result[0] = array[mid+1];
        int max = result[0];
        int maxIndex = 0;
        for(int i = 1; i <= result.length - 1; i++) {
            result[i] = array[i+mid+1] + result[i-1];
            if(result[i] > max){
                max = result[i];
                maxIndex = i;
            }
        }
        return max;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(i == array.length - 1){
                System.out.println(array[i]);
                return;
            }
            System.out.print(array[i] + ", ");
        }
    }
}