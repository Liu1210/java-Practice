class Fu {
    int num = 5;

    void method1() {
        System.out.println("fu method_1");
    }

    void method2() {
        System.out.println("fu method_2");
    }

    static void method4() {
        System.out.println("fu method_4");
    }
}

class Zi extends Fu {
    int num = 8;

    void method1() {
        System.out.println("zi method_1");
    }

    void method3() {
        System.out.println("zi method_3");
    }

    static void method4() {
        System.out.println("fu method_4");
    }
}

public class DouTaiDemo3 {
    public static void main(String[] args) {
        Fu f = new Zi();
        System.out.println(f.num);
        f.method4();
        Zi z = new Zi();
        z.method4();
    }

}
