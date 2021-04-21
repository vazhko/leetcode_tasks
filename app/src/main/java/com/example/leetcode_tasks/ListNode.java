package com.example.leetcode_tasks;

public class ListNode<T> {

    private NodeItem tail;
    private NodeItem head;

    public NodeItem getHead() {
        return head;
    }

    public ListNode() {
        this.tail = null;
        this.head = null;
    }

    public void apend(T data){
        NodeItem<T> newNode = new NodeItem<>(data);
        if(head == null){
            head = newNode; // remember first element
        } else {
            tail.setNext(newNode);
        }
        tail = newNode;
    }


    public int getLength(){
        int len = 0;
        if (head == null) return 0;
        return head.getLength();
    }

    public String print(){
        String mess = "";
        NodeItem<T> ni = head;
        while (ni != null){
            mess +=  " " + ni.getData().toString();
            ni = ni.getNext();
        }
        return (mess);
    }

}
