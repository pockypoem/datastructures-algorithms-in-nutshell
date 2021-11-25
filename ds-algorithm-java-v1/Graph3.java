import java.util.*;

public class Graph3 {
    ArrayList<Node2> nodes;
    int[][] matrix;

    Graph3(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Node2 node) {
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
        for(Node2 node : nodes) {
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

    public void depthFirstSearch(int src) {
        boolean[] visited = new boolean[matrix.length];
        dFSHelper(src, visited);;
    }

    private void dFSHelper(int src, boolean[] visited) {
        //you can either implement DFS iteratively using stack or you can utilize the call stack with recursion
        //in this example we will use recursion
        if(visited[src] == true) {
            return;
        } else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        //matrix[src].length -> equal the length of the row
        for(int i = 0; i < matrix[src].length; i++) {
            //src is the row that we working with
            //i is the column
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            } 
        }
        //if we successfully search to the entire of the row
        return;
    }
}
