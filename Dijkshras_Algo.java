import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;

public class Dijkshras_Algo {
    static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static class pair implements Comparable<pair>{
        int node;
        int dist;

        public pair(int n , int d){
            this.node = n;
            this.dist = d;
        }

        @Override

        public int compareTo(pair p2){
            return this.dist - p2.dist;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }

    public static void dijkshtras(ArrayList<Edge> graph[], int src , int V){
        PriorityQueue<pair> pq = new PriorityQueue<>();

        int dist[] = new int[V];
        for(int i=0; i<V; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        boolean vist[] = new boolean[V];

        pq.add(new pair(0,0));

        while(!pq.isEmpty()){
            pair curr = pq.remove();
            if(!vist[curr.node]){
                vist[curr.node] = true;

                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    int u = e.src;
                    int v = e.dest;

                    if(dist[u] + e.wt < dist[v]){
                        dist[v] = dist[u] + e.wt;
                        pq.add(new pair(V, dist[V]));   
                    }
                }
            }
        }
        for(int i=0; i<V; i++){
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main (String args[]){
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        dijkshtras(graph, 0, V);
    }
}
