/**
 *设计模式：解决某一类问题最行之有效的方法。
 * java中23种设计模式：
 * 单利设计模式：解决一个类在内存只存在一个对象。
 * 想要保证对象唯一：
 * 1、为了避免其他程序过多建立该类对象。先禁止其他程序建立该类对象
 * 2、还为了让其他程序可以访问到该类对象，之好在本类中自定义一个对象。
 * 3、为了方便其他程序对自定义对象的访问，可以对外提供一些访问方式。
 * 这三步的代码体现
 * 1、将构造函数私有化。
 * 2、在类中创建一个本类对象。
 * 3、提供一个方法可以获取到该对象、
 */
public class Single {
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    private Single() {
    }

    private static Single s = new Single();

    public static Single getInstance() {
        return s;
    }
}

class SingleDemo {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        s1.setNum(23);
        System.out.println(s2.getNum());
        //Single s1=new Single();
        //Single s2=new Single();
        //s1.setNum(30);
        //System.out.println(s2.getNum());
    }
}

class Student {
    private int age;
    private static Student s = new Student();

    private Student() {
    }

    public static Student getStudent() {
        return s;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}