package JavaAlgos;

public class binarytreeInOrderTraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of binary tree is ");
        tree.printInorder(tree.root);
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

    BinaryTree() { root = null; }
    
    //print nodes in inorder
    void printInorder(Node node){
        if(node == null){
            return;
        }
        //recur on left
        printInorder(node.left);
        //print the data | INORDER|
        System.out.print(node.key + " ");
        //recurr on right 
        printInorder(node.right);  
    }
}
