public class Money {
    public static void main(String[] args) {
        int[] arr = {1,2,5};
        int target = 11;
        System.out.println(money(arr, target));
    }
    public static int money(int[] arr, int target) {
        int[][] table = new int[arr.length][target+1];
        for(int j = 0; j < table[0].length; j++) {
            if((float)j/arr[0] == (int)(j/arr[0])) {
                table[0][j] = j/arr[0];
            }
               else{
            table[0][j] = target+1;
               }
        }
        for(int i = 0; i < table.length; i++) {
            table[i][0] = 0;
        }
        for(int i = 1; i < table.length; i++) {
            for(int j = 1; j < table[i].length; j++) {
                if(j - arr[i] < 0) {
                    table[i][j] = table[i-1][j];
                    continue;
                }
                table[i][j] = Math.min(1 + table[i][j - arr[i]],table[i-1][j]); 
            }
        }
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        return table[arr.length - 1][target] > target ? -1:table[arr.length - 1][target];
        /*
        int[] table = new int[target+1];
        Arrays.fill(table,target+1);
        table[0] = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < table.length; j++) {
                if(j - arr[i] >= 0) {
                    table[j] = Math.min(table[j],1+table[j - arr[i]]);
                }
            }
        }
        return table[target] > target ? -1:table[target];
        */
    }
}