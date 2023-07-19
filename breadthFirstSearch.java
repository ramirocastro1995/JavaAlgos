package JavaAlgos;

import java.util.Iterator;
import java.util.LinkedList;

public class breadthFirstSearch {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 2);

        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        g.BreadthFirstSearchFunction(2);
    }
}

class Graph {
    //Numero de vertices
    private int V;
    //Listas adyancentes
    private LinkedList<Integer> adj[];

    //Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for(int i = 0;i<v;++i){
            adj[i] = new LinkedList();
        }
    }

    //agregar un borde
    void addEdge(int v , int w) { adj[v].add(w);}

    void BreadthFirstSearchFunction(int s){
        //Marcar todos los vertices como no visitados
        boolean visited[] = new boolean[V];
        //create queue for bfs
        LinkedList<Integer> queue = new LinkedList<Integer>();
        //Mark current node as visited and equeue
        visited[s] = true;
        queue.add(s);

        while(queue.size() != 0){
            //dequeue vertex and print it
            s = queue.poll();
            System.out.println(s + " ");
            //get adjacent vertices of dequeue
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
    
}
