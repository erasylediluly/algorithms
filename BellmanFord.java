public class BellmanFord {
    public static void main(String[] args) {
        int V = 5;
        int E = 7;
        Graph graph = new Graph(V, E); 
  
        // add edge 0-1 (or A-B in above figure) 
        graph.edge[0].src = 1; 
        graph.edge[0].dest = 2; 
        graph.edge[0].weight = 6; 
  
        // add edge 0-2 (or A-C in above figure) 
        graph.edge[1].src = 1; 
        graph.edge[1].dest = 3; 
        graph.edge[1].weight = 5; 
  
        // add edge 1-2 (or B-C in above figure) 
        graph.edge[2].src = 3; 
        graph.edge[2].dest = 2; 
        graph.edge[2].weight = -2; 
  
        // add edge 1-3 (or B-D in above figure) 
        graph.edge[3].src = 2; 
        graph.edge[3].dest = 4; 
        graph.edge[3].weight = -1; 
  
        // add edge 1-4 (or A-E in above figure) 
        graph.edge[4].src = 3; 
        graph.edge[4].dest = 4; 
        graph.edge[4].weight = 4; 
  
        // add edge 3-2 (or D-C in above figure) 
        graph.edge[5].src = 4; 
        graph.edge[5].dest = 5; 
        graph.edge[5].weight = 3; 
  
        // add edge 3-1 (or D-B in above figure) 
        graph.edge[6].src = 3; 
        graph.edge[6].dest = 5; 
        graph.edge[6].weight = 3; 
  
  
        bellmanFord(graph, 1,4,5);
    }
    /*
          1 2 3 4 5
        1 0 6 5
        2 0 3 5 5 8 
        3 0 3 5 2 8
        4 0 
   */
    public static int bellmanFord(Graph graph,int src,int e, int v) {
        int[][] table = new int[e][v];
    }
}
class Edge { 
    int src, dest, weight; 
    Edge() 
    { 
        src = dest = weight = 0; 
    } 
}
class Graph {
    int V, E; 
    Edge edge[]; 
    Graph(int v, int e) { 
        V = v; 
        E = e; 
        edge = new Edge[e]; 
        for (int i = 0; i < e; ++i) 
            edge[i] = new Edge(); 
    } 
}
