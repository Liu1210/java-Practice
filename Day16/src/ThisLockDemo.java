class Ticket1 implements Runnable {
    private static int tick = 300;
    //Object obj = new Object();
    boolean flag = true;

    public void run() {
        if (flag) {
            while (true) {
                synchronized (Ticket1.class) {
                    if (tick > 0) {
                        try { Thread.sleep(10);} catch (Exception e) {
                        }
                        System.out.println(Thread.currentThread().getName() + "code...:" + tick--);
                    }
                }
            }
        } else
            while (true)
                show();
    }

   public static synchronized void show() {
        if (tick > 0) {
            try {Thread.sleep(10);} catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName() + "show...:" + tick--);
        }
    }
}

class ThisLockDemo {
    public static void main(String[] args) {
        Ticket1 t = new Ticket1();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t.flag=false;
        t2.start();

    }
}