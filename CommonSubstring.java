import java.util.Arrays;

public class CommonSubstring { 
        /*
           "" b a c b a d
        "" 0  1 2 3 4 5 6
        a  1  1 2
        b  2
        a  3
        z  4
        d  5
        c  6
        */
    public static void main(String[] args) {
        System.out.println(commonLongestSubsequence("ba", "a"));
    }
    public static int commonLongestSubsequence(String a, String b) {
        int[][] table = new int[a.length() + 1][b.length() + 1];
        for(int i = 1; i < a.length() +1; i++) {
            for(int j = 1; j < b.length() + 1; j++) {
                if(a.charAt(i-1) == b.charAt(j-1)) {
                    table[i][j] = table[i-1][j-1] + 1;
                }
                else{
                    table[i][j] = Math.max(table[i-1][j],table[i][j-1]);
                }
            }
            System.out.println(Arrays.toString(table[i]));
        }
        return table[a.length()][b.length()];
    }
}