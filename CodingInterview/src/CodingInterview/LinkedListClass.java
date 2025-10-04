package CodingInterview;

import java.util.LinkedList;

public class LinkedListClass {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }

    public LinkedListClass(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
}
