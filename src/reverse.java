import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next = null;
    }
}

class LinkedList{
    Node head;
    void insert(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void print(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList m = new LinkedList();

        System.out.print("Enter number of elements: ");
        int d = s.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < d; i++) {
            int n = s.nextInt();
            m.insert(n);
        }
        System.out.println("Reversed Linked List:");
        m.print();
    }
}