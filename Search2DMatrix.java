public class Search2DMatrix {
	public static void main(String[] args) {
		int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
		
	public static String search2DMatrix(int[][] matrix,int target) {
		int left = 0;
		int right = matrix.length * matrix[0].length-1;
		while(left <= right) {
			Point point = new Point((right - left)/2+left,matrix[0].length);
			if(matrix[point.getX()][point.getY()] == target) {
				return point.toString();
			}
			if(matrix[point.getX()][point.getY()] >= target) {
				right = point.getData() - 1;
			}
			if(matrix[point.getX()][point.getY()] < target) {
				left = point.getData() + 1;
			}
		}
		return "not found";
	}
}
class Point {
	int data;
	int length;
	public Point(int data, int length) {
		this.data = data;
		this.length = length;
	}
	public int getX(){
		return data / length;
	}
	public int getY(){
		return data % length;
	}
	public int getData(){
		return data;
	}
	public String toString() {
		return "[" + this.getX() + ", " + this.getY() + "]";
	}
}