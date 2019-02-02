package DPshiyan;

import java.util.ArrayList;

/**
 * Created by user on 2017/12/24.
 */
public class Q09 {
    public static void main(String[] args) {
        GroupComponent gc1 = new Group("a");
        GroupComponent gc2 = new Group("b");
        GroupComponent gc3 = new Group("c");
        GroupComponent m1 = new Member("A");
        GroupComponent m2 = new Member("B");
        GroupComponent m3 = new Member("C");
        gc1.add(gc2);
        gc2.add(gc3);
        gc1.add(m1);
        gc2.add(m2);
        gc3.add(m3);
        gc1.operation();
    }
}
abstract class GroupComponent {
    public void operation() {
    }
    public void add(GroupComponent c) {
    }
    public void remove(GroupComponent c) {
    }
    public GroupComponent getChild(int i) {
        return null;
    }
}
class Group extends GroupComponent {
    private ArrayList<GroupComponent> list = new ArrayList<GroupComponent>();
    private String name;
    Group(String name) {
        this.name = name;
    }
    @Override
    public void operation() {
        for (Object obj : list) {
            ((GroupComponent) obj).operation();
        }
    }
    @Override
    public void add(GroupComponent c) {
        list.add(c);
    }
    @Override
    public void remove(GroupComponent c) {
        list.remove(c);
    }
    @Override
    public GroupComponent getChild(int i) {
        return (GroupComponent) list.get(i);
    }
}
class Member extends GroupComponent {
    private String name;
    Member(String name){
        this.name = name;
    }
    @Override
    public void operation() {
        System.out.println(name+"已接收到群组消息");
    }
    @Override
    public void add(GroupComponent c) {
        System.out.println("该节点不支持本功能");
    }
    @Override
    public void remove(GroupComponent c) {
        System.out.println("该节点不支持本功能");
    }
    @Override
    public GroupComponent getChild(int i) {
        System.out.println("该节点没有子节点");
        return null;
    }
}