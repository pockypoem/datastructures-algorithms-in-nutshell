import java.util.*;

public class Graph4 {
    ArrayList<Node> nodes;

    //2D Array of integer
    int[][] matrix;

    //size will be the amount of nodes that we have
    Graph4(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    //src -> source
    //dst -> destination
    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1; //there is an edge between two nodes
    }

    public boolean checkEdge(int src, int dst) {
        if(matrix[src][dst] == 1) {
            return true;
        } else {
            return false;
        }
    }

    public void print() {

        System.out.print("  ");
        //every node in nodes
        //header for columns
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i < matrix.length; i++) {

            //header for rows
            System.out.print(nodes.get(i).data + " ");

            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void breadthFirstSearch(int src) {
        //src -> the index of the node that we will begin searching at
        //with breadthFirstSearch, we can utilize a queue
        //Integer -> this will be the indexes
        //Queue is interfaces so we need to use a data structures that utilize the queue interface, 
        //one of the datastructure that utilize queue interface is linkedlist
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[matrix.length];

        queue.offer(src);
        visited[src] = true;

        while(queue.size() != 0) {
            src = queue.poll(); //assign src with the value that located in front of the src
            System.out.println(nodes.get(src).data + " = visited");

            //iterate row and look if there is adjacency neighboor on that
            for(int i = 0; i < matrix[src].length; i++) {
                //during each iteration, let's check to see the value is 1, and the nodes that we are trying to visit has not already been visited
                if(matrix[src][i] == 1 && !visited[i]) {
                    queue.offer(i); //i is an index
                    visited[i] = true;
                }
            }
        }
    }
}
