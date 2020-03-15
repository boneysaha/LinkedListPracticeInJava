package com.java.practice;

class Node{
    private int data;
    private Node nextNode;

    public Node(int data){
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Data: "+this.data;
    }

}

class LinkList{
    private Node head;
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        newNode.setNextNode(this.head);
        this.head = newNode;
    }
    public void insertInSorted(int data){
        Node newNode = new Node(data);
        Node current = this.head;
        if(current == null || this.head.getData() > data){
            newNode.setNextNode(this.head);
            this.head = newNode;
            return;
        }
        while(current!=null && current.getNextNode() != null && current.getNextNode().getData() < data ){
            current = current.getNextNode();
        }
        newNode.setNextNode(current.getNextNode());
        current.setNextNode(newNode);
    }

    @Override
    public String toString() {
        String result = "{";
        Node current = this.head;
        while(current!=null){
            result += current.toString() + ",";
            current = current.getNextNode();
        }
        result += "}";
        return  result;
    }

    public int length(){
        int length = 0;
        Node current = this.head;
        while(current!=null){
            length++;
            current = current.getNextNode();
        }
        return length;
    }

    public void deleteFromHead(){
        this.head = this.head.getNextNode();
    }

    public Node find(int data){
        Node current = this.head;
        while(current != null){
            if(current.getData() == data){
                return current;
            }
            current = current.getNextNode();
        }
        return null;
    }

}
public class LinkedListDemo {
    public static void main(String []args){
        LinkList linkedList = new LinkList();
//        linkedList.insertAtHead(5);
//        linkedList.insertAtHead(10);
//        linkedList.insertAtHead(34);
//        linkedList.insertAtHead(78);
//
//        System.out.println(linkedList);
//        System.out.println("length of linkedlist: "+linkedList.length());
//
//        linkedList.deleteFromHead();
//        System.out.println("*********************");
//        System.out.println(linkedList);
//        System.out.println("length of linkedlist: "+linkedList.length());
//
//        System.out.println("find 12 : "+linkedList.find(12));
//        System.out.println("find 10 : "+linkedList.find(10));

        System.out.println("*********************");
        linkedList.insertInSorted(555);
        linkedList.insertInSorted(102);
        linkedList.insertInSorted(340);
        linkedList.insertInSorted(780);
        System.out.println(linkedList);

    }
}
