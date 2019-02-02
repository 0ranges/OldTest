package DesignPatterns.Iterator;

/**
 * Created by user on 2017/4/12.
 */
public class IteratorDemo {
    public static void main(String args[]){
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }
}
interface Collection{
    public Iterator iterator();
    public Object get(int i );
    public int size();
}
interface Iterator{
    public Object previous();
    public Object next();
    public boolean hasNext();
    public Object first();
}
class MyCollection implements Collection{
    public String str[] = {"1","2","3","4","5"};
    public Iterator iterator(){
        return new MyIterator(this);
    }
    public Object get(int i){
        return str[i];
    }
    public int size(){
        return str.length;
    }
}
class MyIterator implements Iterator{
    private Collection collection;
    private int pos = -1;
    public MyIterator(Collection collection){
        this.collection = collection;
    }
    public Object previous(){
        if(pos>0){
            pos--;
        }
        return this.collection.get(pos);
    }
    public Object next(){
        if(pos<collection.size()-1){
            pos++;
        }
        return this.collection.get(pos);
    }
    public Object first(){
        pos = 0;
        return this.collection.get(pos);
    }
    public boolean hasNext(){
        if(pos<collection.size()-1){
            return true;
        }else{
            return false;
        }
    }
}