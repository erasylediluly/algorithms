import java.util.Arrays;

public class LongestPalindromicString {
    public static void main(String[] args) {
        String s = "cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc";
        System.out.println(longestPalindromicString(s));
        /*
          c b b d
        c T F F F
        b   T T F
        b     T F
        d       T
        */
    }
    public static String longestPalindromicString(String s) {
        boolean[][] table = new boolean[s.length()][s.length()];
        String result = "";
        for (int i = 0; i < table.length; i++) {
            Arrays.fill(table[i],true);
        }
        for(int i = 0, j = 0; i < s.length(); i++,j++) {
            table[i][j] = Boolean.TRUE;
        }
        for(int k = 1; k < s.length(); k++) {
            for(int i = 0, j = i+k; i < s.length() && j < s.length(); i++, j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    table[i][j] = Boolean.logicalAnd(table[i+1][j-1],Boolean.TRUE);
                }
                else{
                    table[i][j] = Boolean.FALSE;
                }
                if(table[i][j] == true) {
                    result = s.substring(i, j+1);
                }
            }
        }
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
        return result;
    }
}