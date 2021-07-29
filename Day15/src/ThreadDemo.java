class Demo extends Thread {//thread:线程 是程序中的执行线程。

    public void run() {
        for (int x = 0; x < 60; x++)
            System.out.println("demo run-----" + x);
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();//开启线程并执行该线程的run方法
        for (int x = 0; x < 60; x++)
            System.out.println("hello world---" + x);
    }
}
