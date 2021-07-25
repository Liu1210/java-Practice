interface Inter {
    void method();
}

class Test {
    /**
     * static class Inner implements Inter{
     * public void method(){
     * System.out.println("method run");
     * }
     * }
     */
    static Inter function() {
        return new Inter() {
            public void method() {
                System.out.println("method run");
            }
        };
    }
}

public class InnerClassDemo3 {
    public static void main(String[] args) {
        Test.function().method();
        Inter in = Test.function();
        in.method();
        show(new Inter() {
            public void method() {
                System.out.println("method show run");
            }
        });
    }

    public static void show(Inter in) {
        in.method();
    }
}

class InnerTest {
    public static void main(String[] args) {
        new Object() {
            public void function() {

            }
        }.function();
    }
}

