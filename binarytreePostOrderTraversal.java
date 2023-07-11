package JavaAlgos;

public class binarytreePostOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.left = new Node(5);

        System.out.println("Postorder traversal of binary tree is ");
        tree.printPostorder(tree.root);
    }
    
}

class Node {
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;
    }
}

class BinaryTree{

    //root of tree
    Node root;
    //constructor
    BinaryTree() { root = null;}
    //print nodes in postorder travetrsal
    void printPostorder(Node node){
        if(node == null){
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }
}