class Fu2 {
    int num;

    Fu2() {
        num = 60;
        System.out.println("fu run");
    }

    Fu2(int x) {
        System.out.println("fu...." + x);
    }
}

class Zi2 extends Fu2 {
    Zi2() {
        //super(4);
        System.out.println("zi run");
    }

    Zi2(int x) {
        //super(3);
        System.out.println("zi...." + x);
    }
}

public class ExtendsDemo4 {
    public static void main(String[] agse) {
        Zi2 z = new Zi2();
        Zi2 y = new Zi2(4);
    }
}
/**
 * class Person3{
 * private String name;
 * Person3(String name){
 * this.name=name;
 * }
 * void show(){}
 * }
 * class Student extends Person3{
 * Student(String name){
 * Super(name);
 * }
 * void method(){
 * super.show();
 * }
 * }
 */