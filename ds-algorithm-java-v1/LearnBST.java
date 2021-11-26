public class LearnBST {
    public static void main(String[] args) {
        //Learn Binary Search Tree
        //Before create graph in this file, you should create class BinarySearchTree.java and Node3.java
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node3(5));
        tree.insert(new Node3(1));
        tree.insert(new Node3(9));
        tree.insert(new Node3(2));
        tree.insert(new Node3(7));
        tree.insert(new Node3(3));
        tree.insert(new Node3(6));
        tree.insert(new Node3(4));
        tree.insert(new Node3(8));

        tree.remove(2);
        tree.display();
        tree.remove(2);

        // System.out.println(tree.search(10));

    }
}
