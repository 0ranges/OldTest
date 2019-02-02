package DataStructure.Queue;

import java.util.Arrays;

/**
 * Created by user on 2017/4/10.
 */
public class QueueDemo {

    public static void main(String args[]){
        Queue<String> queue = new Queue<String>("ABC", 20);
        System.out.println(queue.toString());
        queue.add("DEF");
        System.out.println(queue.toString());
        queue.add("egg");
        System.out.println(queue.toString());
        System.out.println(queue.empty());
        System.out.println(queue.size());
        System.out.println(queue.element());
        queue.clear();
        System.out.println(queue.empty());
        System.out.println(queue.size());
    }
}
class Queue<T>{
    private int DEFAULT_SIZE = 10;
    private int capacity;
    private Object[] elementData;
    private int front = 0;
    private int rear = 0;
    public Queue()
    {
        capacity = DEFAULT_SIZE;
        elementData = new Object[capacity];
    }

    public Queue(T element)
    {
        this();
        elementData[0] = element;
        rear++;
    }

    public Queue(T element , int initSize)
    {
        this.capacity = initSize;
        elementData = new Object[capacity];
        elementData[0] = element;
        rear++;
    }
    public int size(){
        return rear - front;
    }
    public void add(T element){
        if(rear>capacity-1){
            throw new IndexOutOfBoundsException("the queue is full");
        }
        elementData[rear++] = element;
    }
    public T remove(){
        if(empty()){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        @SuppressWarnings("unchecked")
        T oldValue = (T)elementData[front];
        elementData[rear++] = null;
        return oldValue;
    }
    @SuppressWarnings("unchecked")
    public T element(){
        if(empty()){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        return (T)elementData[front];
    }
    public boolean empty(){
        return rear == front;
    }
    public void clear()
    {

        Arrays.fill(elementData , null);
        front = 0;
        rear = 0;
    }
    public String toString()
    {
        if (empty())
        {
            return "[]";
        }
        else
        {
            StringBuilder sb = new StringBuilder("[");
            for (int i = front  ; i < rear ; i++ )
            {
                sb.append(elementData[i].toString() + ", ");
            }
            int len = sb.length();
            return sb.delete(len - 2 , len).append("]").toString();
        }
    }
}
