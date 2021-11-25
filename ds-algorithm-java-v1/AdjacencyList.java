public class AdjacencyList {
    public static void main(String[] args) {
        //Before create graph in this file, you should create class file Graph2.java and Node.java

        Graph2 graph = new Graph2();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0, 1); //A to B
        graph.addEdge(1, 2); //B to C
        graph.addEdge(1, 4); //B to E
        graph.addEdge(2, 3); //C to D
        graph.addEdge(2, 4); //C to E
        graph.addEdge(4, 0); //E to A
        graph.addEdge(4, 2); //E to C

        graph.print();

    }
}
