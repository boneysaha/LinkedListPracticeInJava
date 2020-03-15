package com.java.practice;

class DoublyEndedLinkList{
    private Node head;
    private Node tail;

    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(this.head == null){
            this.head = newNode;
        }
        if(this.tail != null) {
            this.tail.setNextNode(newNode);
        }
        this.tail = newNode;
    }
    @Override
    public String toString() {
        String result="{";
        Node current = this.head;
        while(current != null){
            result += current.toString()+",";
            current = current.getNextNode();
        }
        result += "}";
        return result;
    }

}


public class DoublyEndedLinkedListDemo {
    public static void main(String []args){
        DoublyEndedLinkList dList = new DoublyEndedLinkList();
        dList.insertAtTail(19);
        dList.insertAtTail(18);
        dList.insertAtTail(17);
        System.out.println(dList.toString());
    }
}
