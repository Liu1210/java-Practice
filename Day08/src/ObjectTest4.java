class Person1{
    private String name;
    private int age;
    Person1(String name){
        this.name=name;
    }
    Person1(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void speak(){
        System.out.println("name="+this.name+"....age="+this.name);
        show();
    }
    public void show(){
        System.out.println(this.name);
    }
}
public class ObjcetTest4 {
    public static void main(String[] args){
        Person1 p =new Person1("李四");
        Person1 p1=new Person1("张三");
        p.speak();
        p1.speak();
    }
}