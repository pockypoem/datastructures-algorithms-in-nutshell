import java.util.ArrayList;

public class Graph {

    ArrayList<Node> nodes;

    //2D Array of integer
    int[][] matrix;

    //size will be the amount of nodes that we have
    Graph(int size) {
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
    
}
