package ru.academits.polyakova.mylist;

public class MyList<T> {
    private ListItem<T> head;
    private int size;

    public ListItem<T> getHead() {
        return head;
    }

    public void setHead(ListItem<T> head) {
        this.head = head;
    }

    public int getSize() {
        if (head != null) {
            while (head.getNext() != null) {
                size++;
                head = head.getNext();
            }
        } else {
            return 0;
        }
        return size;
    }

    public void addFirst(T element) {
        ListItem p = new ListItem();
        p.setData(element);
        p.setNext(head);
        head = p;
        size++;
    }

    public ListItem<T> delFirst() {
        ListItem p = head;
        head = head.getNext();
        size--;
        return p;
    }

    public void delData(T elem){
        if(head == null){
            return;
        }
        if(head.getData() == elem){
            head = head.getNext();
            return;
        }
        ListItem<T> p = head;
        ListItem<T> e = p.getNext();
        while(p.getNext() != null){
            if(p.getNext().getNext() == elem){
                e = p.getNext().getNext();
            }
            p = p.getNext();
        }

    }
}
