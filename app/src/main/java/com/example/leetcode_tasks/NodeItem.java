package com.example.leetcode_tasks;

class NodeItem<T>{

    private T data;
    private NodeItem next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(NodeItem next) {
        this.next = next;
    }

    public NodeItem getNext() {
        return next;
    }

    public boolean isEnd() {
        return next == null;
    }

    public NodeItem(T data) {
        this.data = data;
        next = null;
    }

    public int getLength(){
        int len = 0;
        if(next == null){
            return 1;
        } else {
            len = 1 + next.getLength();
            return len;
        }
    }
}
