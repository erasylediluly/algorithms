import java.util.*;
public class IncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,4};
        System.out.println(sequence(nums));
    }
    public static int sequence(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int[] table = new int[nums.length];
        Arrays.fill(table,1);
        int max = 1;
        for(int i = 1; i < table.length; i++) {
            int temp = 0;
            for(int j = 0; j < i; j++) {
                if(nums[j] < nums[i]) {
                    temp = Math.max(temp,table[j]);
                }
            }
            table[i] = temp+1;
            max = Math.max(max,table[i]);
        }
        
        System.out.println(Arrays.toString(table));
        return max;
    }
}