public class Fibonacci {
    public static void main(String[] args) {
        int fib = 10;
        System.out.println(fib(fib));
    }
    public static int fib(int n) {
        int[] table = new int[n];
        table[0] = 1; 
        table[1] = 1;
        for(int i = 2; i < n; i++) {
            table[i] = table[i-1] + table[i-2];
        }
        return table[n-1];
    }
}