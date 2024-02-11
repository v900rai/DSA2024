package doublyLinkedList;

import org.w3c.dom.Node;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class doublylinkedList {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;

        }
    }

    public static void displayNode(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "...>> ");
            temp = temp.next;
        }
        System.out.println();

    }

    public static void displayNodeprev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "<<... ");
            temp = temp.prev;


        }
    }

        public static void main (String[]args){
            // 4,10,2,99,13
            Node a = new Node(4);
            Node b = new Node(10);
            Node c = new Node(2);
            Node d = new Node(99);
            Node e = new Node(13);
            a.prev = null;
            a.next = b;
            b.prev = a;
            b.next = c;
            c.prev = b;
            c.next = d;
            d.prev = c;
            d.next = e;
            e.prev = d;
            e.next = null;
            displayNode(a);
            displayNodeprev(e);


        }
    }

