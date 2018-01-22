package ru.academits.polyakova.mylist;

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

    public int getSize() {
        if (head != null) {
            size++;
            while (head.getNext() != null) {
                size++;
                head = head.getNext();
            }
        } else {
            return 0;
        }
        return size;
    }

    /*public void addFirst(T element){
        ListItem p = new ListItem(element, head);
        head = p;
    }*/

}
