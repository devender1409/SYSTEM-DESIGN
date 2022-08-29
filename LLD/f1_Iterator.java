//DP1 - > Design pattern 1
// package LLD;

import java.util.Iterator;

public class f1_Iterator {
    public static void main(String[] args) {
        myLinkedList list = new myLinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        for(int i: list){
            System.out.println(i);
        }

    }

    static class myLinkedList implements Iterable<Integer> {
        static class Node {
            int data;
            Node next;
        }

        Node head;
        Node tail;
        int size;

        void addLast(int data) {
            Node node = new Node();
            node.data = data;
            node.next = null;

            if (size == 0) {
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }

        int size() {
            return size;
        }

        @Override
        public Iterator<Integer> iterator() {

            return new MLL_Iterator(head);
        }

        // MyLinkedList Iterator
        static class MLL_Iterator implements Iterator<Integer> {
            Node temp;

             MLL_Iterator(Node temp){
                this.temp = temp;
             }

            @Override
            public Integer next() {
                int val = temp.data;
                temp = temp.next;
                return val;
            }

            @Override
            public boolean hasNext() {
                return temp==null ? false : true;
            }
        }

    }

}
