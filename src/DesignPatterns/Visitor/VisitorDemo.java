package DesignPatterns.Visitor;

/**
 * Created by user on 2017/4/12.
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Visitor visitor = new MyVisitor();
        Subject subject = new MySubject();
        subject.accept(visitor);
    }
}
interface Visitor{
    public void visit(Subject subject);
}
class MyVisitor implements Visitor{
    public void visit(Subject subject){
        System.out.println("visit the subject："+subject.getSubject());
    }
}
interface Subject{
    public void accept(Visitor visitor);
    public String getSubject();
}
class MySubject implements Subject{
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    public String getSubject(){
        return "love";
    }
}