package graph;

import java.util.ArrayList;

public class AdjacencyList {
    public static class Edge{
        private int src;
        private int dest;
        private int weight;
        public Edge(int src , int dest, int weight){
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }
    // create adjacency list graph
    public static void createAdjGraph(ArrayList<Edge> graph[]){
        for (int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,2));

        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));

        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));

        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }
    // print each neighbour and it's weight
    public static void printGraph(ArrayList<Edge> graph[]){
        for (int i =0;i<graph.length;i++){
            for (int j = 0;j<graph[i].size();j++){
                System.out.println("Graph "+ graph[i].get(j).src+" and dest "+graph[i].get(j).src+ " and w = "+graph[i].get(j).weight);
            }
        }
    }


    public static void  main(String[] args){
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createAdjGraph(graph);
        printGraph(graph);

    }
}
