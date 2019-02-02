package DesignPatterns.Memento;

/**
 * Created by user on 2017/4/12.
 */
public class MementoDemo {
    public static void main(String[] args) {
        // 创建原始类
        Original original = new Original("egg");
        // 创建备忘录
        Storage storage = new Storage(original.createMemento());
        // 修改原始类的状态
        System.out.println("初始化状态为：" + original.getValue());
        original.setValue("niu");
        System.out.println("修改后的状态为：" + original.getValue());
        // 回复原始类的状态
        original.restoreMemento(storage.getMemento());
        System.out.println("恢复后的状态为：" + original.getValue());
    }
}
class Original{
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    public Original(String value){
        this.value = value;
    }
    public Memento createMemento(){
        return new Memento(value);
    }
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
class Memento{
    private String value;
    public Memento(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
class Storage{
    private Memento memento;
    public Storage(Memento memento){
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}