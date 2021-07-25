/**
 * 静态内部类:内部类具备static的特性
 * 当内部类被static修饰后，只能直接访问外部类中的static成员，出现了访问局限
 * 在外部其他类中直接访问static内部类的非静态成员：
 * new.Inner.function();
 * 在外部其他类中直接访问static内部类的静态成员：
 * uter.Inner.function();
 * 当内部类中定义了静态成员，该内部类必须是static的。
 * 当外部类中的静态方法访问内部类时，内部类也必须是static的。
 */
class Outer1 {
    private static int x = 3;

    static class Inner {

        static void function() {//静态内部类
            System.out.println("inner:" + x);
        }
    }

    static class Inner2 {
        void show() {
            System.out.println("inner2 show");
        }
    }

    public static void method() {
        Inner.function();
        new Inner2().show();
    }
}

public class InnerClassDemo2 {
    public static void main(String[] args) {
        Outer1.method();
    }
}
