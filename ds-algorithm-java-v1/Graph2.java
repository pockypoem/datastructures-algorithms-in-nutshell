import java.util.*;

public class Graph2 {
    //Linkedlist that would store node
    ArrayList<LinkedList<Node>> alist;

    Graph2() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>(); //after create this new linkedlist, we can add a node to the linkedlist
        currentList.add(node); //new node will be the head of the new linked list
        alist.add(currentList); //add this linkedlist to our arraylist
    }

    public void addEdge(int src, int dst) {
        //to add an edge to our adjacency list, we first need to get a linkedlist from the arraylist
        //let's store this within currentList
        LinkedList<Node> currentList = alist.get(src); //will return a linkedlist
        //like 2 layers, we also need our destination node
        //we need to find the arrayList that this node is located from the head
        Node dstNode = alist.get(dst).get(0); //get(0) means the head of our linkedlist. This is the address of the node that we would like to linked too.
        //We will add the tail to our currentList now
        currentList.add(dstNode); //taking node and add that to the tail of our linkedlist
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for(Node node : currentList) {
            if(node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        //iterate every linkedlist in our arraylist
        for(LinkedList<Node> currentList : alist) {
            for(Node node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
