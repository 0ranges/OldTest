package DataStructure.LinkedList;

/**
 * Created by user on 2017/4/10.
 */
/*public class LinkedListDemo {
    public static void main(String args[]){

    }
}*/
public class LinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }

    private Node<T> head, tail;

    public LinkedList() {
        this.head = this.tail = null;
    }

    /**
     * judge the list is empty
     */
    public boolean isEmpty() {
        return tail == null;
    }

    /**
     * add head node
     */
    public void addHead(T item) {
        head = new Node<T>(item);
        if (tail == null) {
            tail = head;
        }
    }

    /**
     * add the tail pointer
     */
    public void addTail(T item) {
        if (!isEmpty()) {
            tail.next = new Node<T>(item);
            tail = tail.next;
        } else {
            head = tail = new Node<T>(item);
        }
    }

    /**
     * print the list
     */
    public void traverse() {
        if (isEmpty()) {
            System.out.print("null");
        } else {
            for (Node p = head; p != null; p = p.next) {
                System.out.print(p.data + " ");
            }
        }
    }

    /**
     * insert node from head
     */
    public void addFromHead(T item) {
        Node newNode = new Node<>(item);
        newNode.next = head;
        head = newNode;
    }

    /**
     * insert node from tail
     */
    public void addFromTail(T item) {
        Node newNode = new Node(item);
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = newNode;
        newNode.next = null;
    }

    /**
     * delete node from head
     */
    public void removeFromHead() {
        if (!isEmpty())
            head = head.next;
        else
            System.out.println("The list have been emptied!");
    }

    /**
     * delete from tail, lower effect
     */
    public void removeFromTail() {
        Node prev = null, curr = head;
        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
            if (curr.next == null) {
                prev.next = null;
            }
        }
    }

    /**
     * insert a new node
     *
     * @param appointedItem
     * @param item
     * @return
     */
    public boolean insert(T appointedItem, T item) {
        Node prev = head,curr = head.next;
        Node newNode = new Node(item);
        if(!isEmpty()){
            while((curr != null)&&(appointedItem.equals(curr.data))){
                prev = curr;
                curr = curr.next;
            }
            newNode.next = curr;
            prev.next = newNode;
            return true;
        }
        return false;
    }
    public void remove(T item){
        Node curr = head,prev = null;
        boolean found = false;
        while(curr != null&& !found){
            if(item.equals(curr.data)){
                if(prev == null){
                    removeFromHead();
                }
                else{
                    prev.next = curr.next;
                }
                found = true;
            }
            else{
                prev = curr;
                curr = curr.next;
            }
        }
    }
    public int indexOf(T item){
        int index = 0;
        Node p;
        for(p = head;p!=null;p=p.next){
            if(item.equals(p.data))
                return index;
            index++;
        }
        return -1;
    }
    /**
     * judge the list contains one data
     */
    public boolean contains(T item) {
        return indexOf(item) != -1;
    }
}
