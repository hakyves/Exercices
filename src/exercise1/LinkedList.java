package exercise1;

// Java program to detect loop in a linked list
import java.util.*;

public class LinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next = null;
        }
    }
    //* Inserts a new Node at front of the list
    static public void push(int new_data)
    {
        // 1 & 2: Allocate the Node & Put in the data
        Node new_node = new Node(new_data);
        //3. Make next of new Node as head
        new_node.next = head;
        //4. Move the head to point to new Node
        head = new_node;
    }
    static boolean detectLoop(Node h)
    {
        HashSet<Node> s = new HashSet<Node>();
        while(h!=null){
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if(s.contains(h))
                return true;
            s.add(h);
            h=h.next;
        }
        return false;
    }
    public static void main(String []args){
        LinkedList llist = new LinkedList();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);
        // create loop for testing
        llist.head.next.next.next = llist.head;
        if(detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No loop");
    }


}


