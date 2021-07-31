class StopThread implements Runnable {
    private boolean flag = true;

    public synchronized void run() {
        while (flag) {
            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "....Exception");
            }
            System.out.println(Thread.currentThread().getName() + "....run");
        }
    }

    public void changeFlag() {
        flag = false;
    }
}

public class StopThreadDemo {
    public static void main(String[] args) {
        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);
        int num = 0;
        while (true) {

            if (num++ == 60) {
                t1.interrupt();
                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread());
        }
        System.out.println("over");
    }
}
