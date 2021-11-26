public class BinarySearchTree {
    Node3 root;

    public void insert(Node3 node) {
        //is going to call its helper method
        root = insertHelper(root, node);
    }

    //a helper method of the insert method
    //helpermethod cause it will be using a recursion. It's easier to use recursion if we have helper method.
    private Node3 insertHelper(Node3 root, Node3 node) {
        int data = node.data;

        //let's check if our noot is assign or not
        if(root == null) {
            //this is the first node
            root = node;
            return root;
        } else if(data < root.data) {
            root.left = insertHelper(root.left, node); //it's for passing in the left child of the original root node, 
            //well than left child is know the root node of sbu-tree that we currently working with.
        } else {
            root.right = insertHelper(root.right, node);
        }

        return root; //return the current root
    }

    public void display() {
        //invoke helper method
        displayHelper(root);
    }

    //a helper method of the display method
    private void displayHelper(Node3 root) {
        //check if the root node of our sub-tree doesn't equal null
        if(root != null) {
            //passing the root child left node
            displayHelper(root.left);
            /*
            if for using recursion , the first piece of data that is displayed is list value
            and this value will be displayed in increasing order
            */
            System.out.println(root.data); //root node of the sub-tree
            displayHelper(root.right); //right child node
            //that is inorder traversal
            //all of nodes will be displayed in non-decreasing order

            //if you want the data to descending order, you can use this:
            /*
            displayHelper(root.right);
            System.out.println(root.data);
            displayHelper(root.left);
            */
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    } 

    //a helper method of the search method
    private boolean searchHelper(Node3 root, int data) {
        if(root == null) {
            return false; //it means our root is empty
        } else if(root.data == data) {
            //that means we found the data that we are looking for
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data); //we go left
        } else {
            return searchHelper(root.right, data); //we go right
        }
    }

    public void remove(int data) {
        //let's check the data even exist first
        if(search(data)) {
            //if we found the data that we are looking for, invoke the removeHelper
            removeHelper(root, data);
        } else {
            System.out.println(data + " could not be found");
        }
    }

    public Node3 removeHelper(Node3 root, int data) {
        if(root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if(data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            //node found
            if(root.left == null && root.right == null) {
                //that's mean that node that we are trying to remove is the leaf node
                //we don't need to shift around 
                root = null;
            } else if(root.right != null) {
                //that's mean it is the right child
                //find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);  
            } else {
                //that's mean it is the left child
                //find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    //to find successor and predeccessor, this is in case if we deleting a node, we must to shift the nodes around
    public int successor(Node3 root) {
        //find least value below the right child of this root node
        root = root.right;
        while(root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public int predecessor(Node3 root) {
        //find greatest value below the right child of this root node
        root = root.left;
        while(root.right != null) {
            root = root.right;
        }
        return root.data;
    }
}  
