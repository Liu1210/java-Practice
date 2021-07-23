/**
 * final: 最终。作为一个修饰符。
 * 1、可以修饰类，函数，变量、
 * 2、被final修饰的类不可以被继承。为了避免被继承，被子类复写功能。
 * 3、被final修饰的方法不可以被复写。
 * 4、被final修饰的变量是一个常量只能赋值一次，既可以修饰成员变量，又可以修饰局部变量。
 */
class Demo {
    final int x = 3;
    public static final double PI = 3.14;

    final void show1() {
    }

    void show2() {
        final int y = 4;
        System.out.println((3.14));
    }
}

class SubDemo extends Demo {
    void show2() {
    }
}

public class FinalDemo {
    public static void main(String[] args) {
        System.out.println();
    }
}
