class Test extends Thread {
   // private String name;

    Test(String name) {
        //this.name = name;
        super(name);
    }

    public void run() {
        for (int x = 0; x <= 100; x++) {
            System.out.println(this.getName() + "run" + x);
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        Test t1 = new Test("one");
        Test t2 = new Test("two");
        t1.start();
        t2.start();
        for (int x = 0; x < 100; x++) {
            System.out.println("main....." + x);
        }

    }
}
