import javax.annotation.Resource;
import java.util.NavigableMap;
import java.util.function.Consumer;

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        Natural n = new Natural();
        Producer1 pro = new Producer1(n);
        Consumer1 con = new Consumer1(n);
        Thread t1 = new Thread(pro);
        Thread t2 = new Thread(pro);
        Thread t3 = new Thread(con);
        Thread t4 = new Thread(con);
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

class Natural {
    private String name;
    private int count = 1;
    private boolean flag = false;

    public synchronized void set(String name) {
        while (flag)
            try {
                this.wait();
            } catch (Exception e) {
            }
        this.name = name + "--" + count++;
        System.out.println(Thread.currentThread().getName() + "...生产者.." + this.name);
        flag = true;
        this.notifyAll();
    }

    public synchronized void out() {
        while (!flag)
            try {
                wait();
            } catch (Exception e) {
            }
        System.out.println(Thread.currentThread().getName() + "...消费者......." + this.name);
        flag = false;
        this.notifyAll();
    }
}

class Producer1 implements Runnable {
    private Natural nat;

    Producer1(Natural res) {
        this.nat = res;
    }

    public void run() {
        while (true) {
            nat.set("+商品");
        }

    }
}

class Consumer1 implements Runnable {
    private Natural nat;

    Consumer1(Natural nat) {
        this.nat = nat;
    }

    public void run() {
        while (true) {
            nat.out();
        }
    }
}