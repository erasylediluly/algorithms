import java.util.*;
import java.lang.*;
public class LongestPalindromisSubsequence {
    public static void main(String[] args) {
        System.out.println(longestPalindromisSubsequence("bbbab"));
    }
    /*
      b b b a b
    b 1 2 3 3 4
    b 0 1 2 2 3
    b 0 0 1 1 3
    a 0 0 0 1 1
    b 0 0 0 0 1
    */ 
    public static int longestPalindromisSubsequence(String s) {
        int[][] table = new int[s.length()][s.length()];
        for(int i = 0, j = 0; i == j && i < s.length();i++,j++){
            table[i][j] = 1;
        }
        for(int k = 1; k < s.length(); k++) {
            for(int i = 0, j = i+k; j < s.length() && i < s.length();i++,j++){
                if(s.charAt(i) == s.charAt(j)){
                    table[i][j] = table[i+1][j-1] + 2;
                }
                else{
                    table[i][j] = Math.max(table[i][j-1], table[i+1][j]);
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
        return table[0][table.length-1];
    }
}