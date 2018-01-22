package ru.academits.polyakova.mylist.ru.academits.polyakova.mylist.main;

import ru.academits.polyakova.mylist.ListItem;
import ru.academits.polyakova.mylist.MyList;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.addFirst(6);
        System.out.println(list.getHead().getData());
        System.out.println(list.getSize());
        list.delFirst();

        System.out.println(list.getSize());
    }
}
