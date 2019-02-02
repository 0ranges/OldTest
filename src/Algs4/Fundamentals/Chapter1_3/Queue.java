package Algs4.Fundamentals.Chapter1_3;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by user on 2017/11/24.
 */
//P95
public class Queue<Item> implements Iterable<Item>{
    private Node<Item> first;
    private Node<Item> last;
    private int N;
    private class Node<Item>{
        Item item;
        Node<Item> next;
    }
    public boolean isEmpty(){
        return first == null;
        //return N == 0;
    }
    public int size(){
        return N;
    }
    public void enqueue(Item item){
        /** write by myself
        Node newLast = new Node();
        newLast.item = item;
        last.next = newLast;
        last = newLast;
        N++;
         **/
        Node oldLast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty())
            first = last;
        else
            oldLast.next = last;
        N++;
    }
    public Item dequeue(){
        Item item = first.item;
        first = first.next;
        if(isEmpty())
            last = null;
        N--;
        return item;
    }
    public Iterator<Item> iterator()  {
        return new ListIterator<Item>(first);
    }

    private class ListIterator<Item> implements Iterator<Item> {
        private Node<Item> current;

        public ListIterator(Node<Item> first) {
            current = first;
        }

        public boolean hasNext()  { return current != null;                     }
        public void remove()      { throw new UnsupportedOperationException();  }

        public Item next() {
            if (!hasNext()) throw new NoSuchElementException();
            Item item = current.item;
            current = current.next;
            return item;
        }
    }
}
