import java.util.*;
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int[] table = new int[nums.length+1];
        for(int i = 1; i < table.length; i++) {
            int temp = 0;
            for(int j = 0; j < i-1; j++) {
                if(table[j] > temp) temp = table[j];
                System.out.println("i: " + i + ", " + table[j]);
            }
            table[i] = Math.max(temp+nums[i-1],table[i-1]);
        }
        System.out.println(Arrays.toString(table));
        return table[nums.length];
    }
}