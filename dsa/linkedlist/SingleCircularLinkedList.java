package dsa.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SingleCircularLinkedList {
    private Node last;

    public void push(int data) {
        if(last == null) {
            last = new Node(data);
            last.next = last;
            return;
        }

        Node newHeadNode = new Node(data);
        newHeadNode.next = last.next;
        last.next = newHeadNode;
    }

    public void append(int data) {
        if(last == null) {
            last = new Node(data);
            last.next = last;
            return;
        }

        Node newLastNode = new Node(data);
        newLastNode.next = last.next;
        last.next = newLastNode;
    }

    public void print() {
        if(last == null) {
            System.out.println("No data is found");
            return;
        }
        Node firstNode = last.next;
        do {
            System.out.print("=> "+ firstNode.data);
            firstNode = firstNode.next;
        }while(firstNode != last.next);
    }

    public Node getFirstNode() {
        return last.next;
    }

    public Node getLastNode() {
        return last;
    }

    public static void main(String args[]) {
        SingleCircularLinkedList scl = new SingleCircularLinkedList();
        scl.push(3);
        scl.append(4);
        scl.push(2);
        scl.push(1);
        scl.print();
    }
}
