package dsa.linkedlist;

class Node {
    int data;
    Node next;
    Node prev;
 
    Node(int data) {
        this.data = data;
        next = prev = null;
    }
}
public class DoubleLinkedList {
    Node head;
    Node last;
    int size = 0;

    public void push(int data) {
        size++;
        if(head == null) {
            head = new Node(data);
            last = head;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void append(int data) {
        if(head == null) {
            push(data);
        }

        size++;
        Node newNode = new Node(data);
        last.next = newNode;
        newNode.prev = last;
        last = newNode;
    }

    public void print() {
        Node firstNode = head;
        while(firstNode != null) {
            System.out.println(firstNode.data+" =>");
            firstNode = firstNode.next;
        }
    }

    public void printReverse() {
        Node lastNode = last;
        while(lastNode != null) {
            System.out.println(lastNode.data+" =>");
            lastNode = lastNode.prev;
        }
    }

    public static void main(String aString[]) {
        DoubleLinkedList dbl = new DoubleLinkedList();
        dbl.push(3);
        dbl.push(2);
        dbl.push(1);
        dbl.append(4);
        //dbl.print();
        dbl.printReverse();
    }
}
