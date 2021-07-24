/**
 * class用于定义类
 * interface用于定义接口
 * 接口定义时，格式特点：
 * 1，接口中常见定义：常量，修饰方法。
 * 2，接口中的成员都有固定修饰符。
 * 常量：public static final
 * 方法：public abstract
 * 接口中的成员都是public的。
 * 接口是不可以创建对象的，因为有抽象方法。
 * 需要被子类实现，子类对接口中的抽象方法全部覆盖后，子类才可以实例化，否则子类是一个抽象类。
 * 接口可以被类多实现。
 */
interface Inter {
    public static final int NuM = 3;

    public abstract void show();
}

interface InterA {
    public abstract void show();
}

class Demo {
    public void function() {
    }
}

class Test extends Demo implements Inter, InterA {
    public void show() {
    }
}

interface A {
    void methodA();
}

interface B {
    void methodB();
}

interface C extends B, A {
    void methodC();
}

class D implements C {
    public void methodA() {
    }

    public void methodB() {
    }

    public void methodC() {
    }

}

public class InterfaceDemo {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.NuM);
        System.out.println(Test.NuM);
        System.out.println(Inter.NuM);
    }
}
