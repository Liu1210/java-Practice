/**
 * extends:继承
 * 1、提高了代码的复用性。
 * 2，让类与类之间产生了关系，有了这个关系，才有了多态的特性。
 * 必须是类与类之间有所属关系才可以继承，所属关系is a。
 */
class Person1{
    String name;
    int age;
}
class Student extends Person1{
    void study(){
        System.out.println("good study");
    }
}
class Worker extends Person1{
    void work(){
        System.out.println("good work");
    }
}
public class ExtendDemo {
}
