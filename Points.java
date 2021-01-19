public class Points {
    public static void main(String[] args) {
        
    }
    public static float bruteForce(Point[] P,int n) {
        float min = Float.MIN_VALUE;
        for(int i = 0; i < n;i++) {
            for(int j = i+1;j < n;j++) {
                if(P[i].distanceTo(P[j]) < min)
                    min = P[i].distanceTo(P[j]);
            }
        }
        return min;
    }
    public static float stripClosest(Point[] strip, int size, float d) {
        float min = d;
        for(int i = 0; i < size; i++) {
            for(int j = i + 1; j < size && (strip[j].y - strip[i].y) < min; j++) {
                if(strip[i].distanceTo(strip[j]) < min) {
                    min = strip[i].distanceTo(strip[j]);
                }
            }
        }
        return min;
    }
    public static float closestUtil(Point Px[], Point Py[], int n) {
        if(n <= 3) {
            return bruteForce(Px, n);
        }
        int mid = n/2;
        Point midPoint = Px[mid];

        Point[] Py1 = new Point[mid+1];
        Point[] Pyr = new Point[n-mid-1];
        int li = 0, ri = 0;
        for(int i = 0; i < n; i++) {
            if(Py[i].x = midPoint.x) {
                Pyl[li++] = Py[i]; 
            }
            else
                Pyr[ri++] = Py[i]; 
        }
        float dl = closestUtil(Px, Pyl, mid); 
        float dr = closestUtil(Px, Pyr, n-mid);
        float d = Math.min(dl, dr);
        Point[] strip = new Point[n];
        int j = 0; 
        for (int i = 0; i < n; i++) 
            if (abs(Py[i].x - midPoint.x) < d) 
                strip[j] = Py[i];
                j++; 
        return Math.min(d, stripClosest(strip, j, d) );   
    }
    public static float closest(Point P[], int n)  {  
        qsort(P, n, sizeof(Point), compareX);  
        return closestUtil(P, n);  
    }   
}
class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int distanceTo(Point p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y,2));
    }
}