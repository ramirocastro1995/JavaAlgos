package JavaAlgos;

public class doublylinkedlist {
    
    //node class
    class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item){
            this.item = item;
        }
    }
    //head  and tail set to null
    Node head, tail = null;

    //add node to list
    public void addNode(int item) {
        //create new node from class
        Node newNode = new Node(item);

        if(head == null) {
            head = tail = newNode;
            //previous head will be null
            head.previous = null;
            //tails next will be null
            tail.next = null;
        }
        else{
            //add newNode to the end of list. tail -> next set to newNode
            tail.next = newNode;
            //newNode -> previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail next point to null
            tail.next = null;
        }
    }
    public void printNodes() {
        //Node current will point to head
        Node current = head;
        if(head == null){
            System.out.println("Doubly is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next
            System.out.println(current.item + " ");
            current = current.next;
        }
    }
}

class Main{
    public static void main(String[] args) {
        //create doubly object
        doublylinkedlist dl_List = new doublylinkedlist();
        //add nodes to the list
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);
        dl_List.printNodes();
    }
}
