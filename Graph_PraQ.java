import java.util.ArrayList;
import java.util.Stack;

public class Graph_PraQ {
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
            graph[i] = new ArrayList<Edge>();
        }

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean vist[], int curr, boolean rec[]){
        vist[curr] = true;
        rec[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vist[e.dest]){
                return true;
            }
            else if(!vist[e.dest]){
                if(isCycle(graph, vist, e.dest, rec)){
                    return true;
                };
            }
        }
        rec[curr] = false;
        return false;
    }

    public static void topologicalSort(ArrayList<Edge> graph[], boolean vist[], int curr, Stack<Integer> stack){
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(!vist[e.dest]){
                topologicalSort(graph,vist,e.dest,stack);
            }
        }
        stack.push(curr);
    }

    public static void topSort(ArrayList<Edge> graph[], int V){
        boolean vist[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<V; i++){
            if(!vist[i]){
                topologicalSort(graph, vist, i, stack);
            }
        }

        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vist[], int curr, int parent){
        vist[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);

            if(vist[e.dest] == true && e.dest != parent){
                return true;
            }
            else if(!vist[e.dest]){
                if(isCycleUndirected(graph, vist, e.dest, curr) == true){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String args[]){
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        boolean vist[] = new boolean[V];
        boolean rec[] = new boolean[V];
        
        for(int i=0; i<V; i++){
            if(!vist[i]){
                System.out.println(isCycle(graph, vist, 0, rec));
            }
        }

        //this fuction call for the topological sorting
        topSort(graph, V);

        System.out.println(isCycleUndirected(graph, new boolean[V], 0, -1));
    }
}
