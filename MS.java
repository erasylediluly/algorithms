public class MS{
    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[] {-1,0,-2}));
    }
    
    public static int maxSubArray(int[] a) {
        return helper(a, 0, a.length - 1);
    }
    
    static int helper(int[] a, int l, int r) {
        if(l == r) return a[l];
        int mid = l + (r - l)/2;
        return Math.max(crossMidMax(a, l, r), Math.max(helper(a, l, mid - 1), helper(a, mid + 1, r)));
    }
    
    static int crossMidMax(int[] a, int l, int r) {
        int mid = l + (r - l)/2;
        
        int lmax = a[mid], lg =  a[mid];
        for(int i = mid -1; i >= l; i--) {
            lmax += a[i];
            lg = Math.max(lmax, lg);
        }
        
        int rmax = a[mid], rg =  a[mid];
        for(int i = mid +1; i <= r; i++) {
            rmax += a[i];
            rg = Math.max(rmax, rg);
        }
        
        return lg + rg - a[mid];
    }
}