package exercise1;

import java.util.HashSet;

public class LinkedList1 {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    // Insert a New Node at front of the list
    static public void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static boolean detectLoop(Node h){
        HashSet<Node> setNode = new HashSet<>();
        while(h!=null){
            if(setNode.contains(h))
                return true;
            setNode.add(h);
            h=h.next;
        }
        return false;
    }
    public static void main(String []args){
        LinkedList1 llsit = new LinkedList1();
        llsit.push(20);
        llsit.push(4);
        llsit.push(15);
        llsit.push(10);
        llsit.head.next.next.next = llsit.head;
        if(detectLoop(head))
            System.out.println("Loop foundb ");
        else
            System.out.println("No loop");

    }

}
