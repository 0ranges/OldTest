package DPshiyan;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

/**
 * Created by user on 2017/12/12.
 */
public class Q01 {
    public static void main(String[] args) {
        Shape shape;
        ShapeFactory factory;
        factory = (ShapeFactory)XMLUtil.getBean("ShapeFactory");
        shape = factory.produceShape();
        shape.display();
    }
}
interface Shape{
    public void init();
    public void setColor();
    public void fill();
    public void setSize();
    public void display();
}
class Circle implements Shape{
    public void init(){};
    public void setColor(){};
    public void fill(){};
    public void setSize(){};
    public void display(){
        System.out.println("CircleFactory produces a circle.");
    };
}
class Triangle implements Shape{
    public void init(){};
    public void setColor(){};
    public void fill(){};
    public void setSize(){};
    public void display(){
        System.out.println("TriangleFactory produces a triangle.");
    };
}
class Rectangle implements Shape{
    public void init(){};
    public void setColor(){};
    public void fill(){};
    public void setSize(){};
    public void display(){
        System.out.println("RectangleFactory produces a rectangle.");
    };
}
interface ShapeFactory{
    public Shape produceShape();
}
class CircleFactory implements ShapeFactory{
    public Shape produceShape(){
        return new Circle();
    }
}
class TriangleFactory implements ShapeFactory{
    public Shape produceShape(){
        return new Triangle();
    }
}
class RectangleFactory implements ShapeFactory{
    public Shape produceShape(){
        return new Rectangle();
    }
}