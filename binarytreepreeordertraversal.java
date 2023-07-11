package JavaAlgos;

public class binarytreepreeordertraversal {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
    }   
    
    
}

class Node{
    int key;
    Node left, right;

    public Node(int item){
            key = item;
            left = right = null;
        }
}

class BinaryTree{
    //root of binary tree
    Node root;

    BinaryTree() { root = null;}

    //print the nodes in pre order
    void printPreorder(Node node){
        if(node == null){
            return;
        }
        //print data node |PREORDER|s
        System.out.println(node.key + " ");
        //recur in left subtree
        printPreorder(node.left);
        printPreorder(node.right);
    }

}
