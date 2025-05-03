import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class BFS_Graph {
    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));
        

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,5));

        graph[4].add(new Edge(4,2));
        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));

        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));
        graph[5].add(new Edge(5,6));

        graph[5].add(new Edge(6,5));
    }

    public static void BFS(ArrayList<Edge> graph[], int V, boolean vist[], int start){
        Queue<Integer> q = new LinkedList<>();
       
        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(vist[curr] == false){
                System.out.print(curr + " ");
                vist[curr] = true;

                for(int i=0; i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void DFS(ArrayList<Edge> graph[], int curr, boolean vist[]){
        System.out.print(curr + " ");
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vist[e.dest] == false){
                DFS(graph, e.dest, vist);
            }
        }

    }

    public static void printAllPath(ArrayList<Edge> graph[], boolean vist[], int curr, String path, int target){
        if(curr == target){
            System.out.println(path);
            return;
        }

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vist[e.dest]){
                vist[curr] = true;
                printAllPath(graph, vist, e.dest, path+e.dest, target);
                vist[curr] = false;
            }
        }
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vist[] = new boolean[V];
        for(int i=0; i<V; i++){
            if(vist[i] == false){
                BFS(graph,V,vist,i);
            }
        }
        System.out.println();

        DFS(graph,0,vist);
        System.out.println();

        String path = "0";

        int Source = 0;  int target = 5;
        printAllPath(graph, new boolean[V], Source, path, target);
    }
}
