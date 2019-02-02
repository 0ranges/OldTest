package JAVA.JavaClass01;

/**
 * Created by user on 2017/3/29.
 */
public class CompareDemo {
    public static void main(String args[]){
        BinaryTree bt = new BinaryTree();
        bt.add(8);
        bt.add(1);
        bt.add(19);
        bt.add(2);
        bt.add(10);
        bt.add(5);
        bt.print();
    }
}
class BinaryTree{
    class Node{
        private Comparable data;
        Node right;
        Node left;
        public void addNode(Node newNode){
            if(newNode.data.compareTo(this.data)<0){
                if(this.left == null){
                    this.left = newNode;
                }else{
                    this.left.addNode(newNode);
                }
            }else{
                if(this.right == null){
                    this.right = newNode;
                }else{
                    this.right.addNode(newNode);
                }
            }
        }
        public void printNode(){
            if(this.left != null){
                this.left.printNode();
            }
            System.out.print(this.data+"\t");
            if(this.right != null){
                this.right.printNode();
            }
        }
    }
    private Node root;
    public void add(Comparable data){
        Node newNode = new Node();
        newNode.data = data;
        if(root == null){
            root = newNode;
        }
        else{
            root.addNode(newNode);
        }
    }
    public void print(){
        this.root.printNode();
    }
}