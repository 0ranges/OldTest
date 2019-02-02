package JAVA.Generics;

/**
 * Created by user on 2017/3/25.
 */
public class GenericsDemo {
    public static void main(String args[]){
        Person<Contact> per1 = new Person<Contact>(new Contact("长沙市","123456","100860"));
        System.out.print(per1.toString());
        Person<Introduction> per2 = new Person<Introduction>(new Introduction("阿潘","男",20));
        System.out.print(per2.toString());
    }
}
interface Info_1{

}
class Contact implements Info_1{
    private String address;
    private String telephone;
    private String zipcode;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public Contact(String address,String telephone,String zipcode){
        this.address = address;
        this.zipcode = zipcode;
        this.telephone = telephone;
    }
    public String toString(){
        return "联系方式：+\n"+
                "\t|-联系电话："+this.telephone+"\n"+
                "\t|-联系地址："+this.address+"\n"+
                "\t|-邮政编码："+this.zipcode;
    }
}
class Introduction implements Info_1{
    private String name;
    private String sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Introduction(String name,String sex,int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String toString() {
        return "基本信息：+\n" +
                "\t|-姓名：" + this.name + "\n" +
                "\t|-性别：" + this.sex + "\n" +
                "\t|-年龄：" + this.age;
    }
}
class Person<T extends Info_1>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
    public Person(T info){
        this.info = info;
    }
    public String toString(){
        return this.info.toString();
    }
}