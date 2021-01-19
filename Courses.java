public class Courses{
	public static void main(String[] args) {
		int[][] prerequisites = {{1,0},{0,1}};
		courses(prerequisites);
	}
	public static boolean courses(int[][] prerequisites) {
		HashSet<Integer> set = new HashSet<>();
		for(int i = 0; i < prerequisites.length; i++) {
			for(int j = 0; j < prerequisites[i].length; j++){
				set.add(prerequisites[i][j]);
				if(!set.contains(prerequisites[i][j])){
					Vertex vertex = new Vertex(prerequisites[i][j]);
					System.out.println(vertex);
				}
			}
		}
		return true;
		
	}
}
public class Vertex{
	int value;
	Vertex[] indegree;
	Vertext[] outdegree;
	public Vertex(int value) {
		this.value = value;
	}
	public String toString(){
		return value+"";
	}
}