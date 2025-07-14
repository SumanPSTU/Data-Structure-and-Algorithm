package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CreateGraphs {

    // class for create edge
    public static class Edge{
        private int src;
        private int dest;
        public Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }
    // create graph
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i =0;i<graph.length;i++){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));



        System.out.println("No error");
    }
    // apply breath first search
    public static void breathFirstSearch(ArrayList<Edge>[] graph, int v){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] bool = new boolean[v];
        queue.add(0);
        while (!queue.isEmpty()){
            int current = queue.remove();
            if (!bool[current]){
                System.out.print(current+" ");
                bool[current] = true;
                for (int i =0; i<graph[current].size();i++){
                    queue.add(graph[current].get(i).dest);
                }
            }
        }
    }
    // print all adj list
    public static void printListNode(ArrayList<Edge>[] graph){
        for (int i =0;i<graph.length;i++){
            for (int j = 0;j<graph[i].size();j++){
                System.out.println(graph[i].get(j).src+" "+graph[i].get(j).dest);
            }
        }
    }
    public static void main(String[] args){
        int v = 4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        createGraph(graph);
        // print all neighbours
        printListNode(graph);
        // breath first search method call
        breathFirstSearch(graph,v);
    }
}
