/**
 * 当多个类中出现相同功能，但是功能主体不同。
 * 可以进行向上抽取，只能抽取功能定义，不能抽取功能主体。
 * abstract
 * 抽象类的特点：
 * 1、抽象方法一定在抽象类中。
 * 2、抽象方法和抽象类都必须被abstract关键字修饰、
 * 3、抽象类不可以用new创建对象。因为调用抽象方法没意义。
 * 4.抽象类中的抽象方法要被使用，必须由子类复写所有的抽象方法后，建立子类对象调用
 * 如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类。
 */
abstract class Student1 {
    abstract void study();

    void sleep() {
        System.out.println("躺");
    }
}

class ChongStudent extends Student {
    void study() {
        System.out.println("chong study");
    }
}

class BaseStudent extends Student1 {
    void study() {
        System.out.println("base study");
    }
}

class AdvStudent extends Student1 {
    void study() {
        System.out.println("adv study");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        new BaseStudent().study();
    }
}
