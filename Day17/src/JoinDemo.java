class Demo implements Runnable {
    public void run() {
        for (int x = 0; x < 70; x++) {
            System.out.println(Thread.currentThread().getName() + "....." + x);
        }
    }
}

public class JoinDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
        }
        for (int x = 0; x < 80; x++) {
            System.out.println("main....." + x);
        }
        System.out.println("over");
    }
}
