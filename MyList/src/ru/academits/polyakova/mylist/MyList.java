package ru.academits.polyakova.mylist;

class ListItem<T>{
    private T data;
    private ListItem<T> next;

    public ListItem(T data){this.data = data;}
    public ListItem(T data, ListItem<T> next){this.data = data; this.next = next;}
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }

    public ListItem<T> getNext() {
        return next;
    }
    public void setNext(ListItem<T> next) {
        this.next = next;
    }
}

public class MyList<T> {
    private ListItem<T> head;
    private int size;

    /*public MyList(ListItem<T> head){
        this.head = head;
    }*/

    public ListItem<T> getHead() {
        return head;
    }
    public void setHead(ListItem<T> head) {
        this.head = head;
    }

    public int getSize(){
        int count = 0;
        if(head != null){
            count++;
            while (head.getNext() != null ) {
                count++;
                head = head.getNext();
            }
        } else {
            return 0;
        }
        return count;
    }

    /*public void addFirst(T element){
        ListItem p = new ListItem(element, head);
        head = p;
    }*/

}
