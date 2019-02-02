package DataStructure.Array;

/**
 * Created by user on 2017/4/10.
 */
public class ArrayDemo {
    public static void main(String args[]){
        int data[] = new int[10];
        for(int i = 1;i<=10;i++){
            data[i-1] = i;
        }
        traverse(data);
        insert(data,10,3);
        traverse(data);
        delete(data,5);
        traverse(data);
    }
    public static int[] insert(int old[],int value,int index){
        for(int i = old.length-1;i>index;i--){
            old[i] = old[i-1];
        }
        old[index] = value;
        return old;
    }
    public static void traverse(int[] data){
        for(int i = 0 ;i<data.length;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static int[] delete(int old[],int index){
        for(int i = index;i<old.length-1;i++){
            old[i] = old[i+1];
        }
        old[old.length-1] = 0;
        return old;
    }
}
