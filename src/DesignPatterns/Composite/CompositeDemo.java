package DesignPatterns.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by user on 2017/4/8.
 */
public class CompositeDemo {
    public static void main(String args[]){
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");
        nodeB.add(nodeC);
        tree.root.add(nodeB);

    }
}
class Tree{
    TreeNode root = null;
    public Tree(String name){
        root = new TreeNode(name);
    }
}
class TreeNode{
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode node){
        children.add(node);
    }
    public void remove(TreeNode node){
        children.remove(node);
    }
    public Enumeration<TreeNode> getChildren(){
        return children.elements();
    }
}