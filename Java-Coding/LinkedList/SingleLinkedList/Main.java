package LinkedList.SingleLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //list1
        SingleLinked list1 = new SingleLinked();
        list1.add(0);
        list1.add(3);
        list1.add(1);
        list1.add(0);
        list1.add(4);
        list1.add(5);
        list1.add(2);
        list1.add(0);

        //function call
        Node head = list1.getHead();
    }
}
