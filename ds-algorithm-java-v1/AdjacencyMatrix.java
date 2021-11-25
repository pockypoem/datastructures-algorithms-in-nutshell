public class AdjacencyMatrix {
    public static void main(String[] args) {

        //Before create graph in this file, you should create class file Graph.java and Node.java

        //create graph
        Graph graph = new Graph(5); //create 5 nodes

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        //directed graph
        graph.addEdge(0, 1); //A to B
        graph.addEdge(1, 2); //B to C
        graph.addEdge(2, 3); //C to D
        graph.addEdge(2, 4); //C to E
        graph.addEdge(4, 0); //E to A
        graph.addEdge(4, 2); //E to C

        graph.print();

        System.out.println(graph.checkEdge(0, 1)); //check edge between A and B
        System.out.println(graph.checkEdge(3, 2)); //check edge between D and C

    }
}