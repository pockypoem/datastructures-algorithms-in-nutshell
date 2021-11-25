public class LearnDFS {
    public static void main(String[] args) {
        //Depth First Search
        //Before create graph in this file, you should create class file Graph3.java and Node2.java

        //create graph
        Graph3 graph = new Graph3(5); //create 5 nodes

        graph.addNode(new Node2('A'));
        graph.addNode(new Node2('B'));
        graph.addNode(new Node2('C'));
        graph.addNode(new Node2('D'));
        graph.addNode(new Node2('E'));

        //directed graph
        graph.addEdge(0, 1); //A to B
        graph.addEdge(1, 2); //B to C
        graph.addEdge(2, 3); //C to D
        graph.addEdge(2, 4); //C to E
        graph.addEdge(4, 0); //E to A
        graph.addEdge(4, 2); //E to C

        graph.print();
        System.out.println();

        //directed graph
        graph.depthFirstSearch(1);
        /*
        which nodes to traverse so that all paths in the graph are traversed.
        For the example... from node 1 to pass all the graph paths, nodes that visited (traversed) are:
        B = visited
        C = visited
        D = visited
        E = visited
        A = visited
        */

        //graph.depthFirstSearch(3); it will just : D = visited, cause it is a directed graph, and d has no edges

    }
}
