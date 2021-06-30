package com.bridgeLabz.Extra;

public class InsertEnd {

    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        InsertEnd list = new InsertEnd();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(15);
        list.display();
    }
}
