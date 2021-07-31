class Res {
    private String name;
    private String sex;
    private boolean flag=false;
    public synchronized void set(String name,String sex){
        if(flag)
            try{this.wait();}catch (Exception e){}
        this.name=name;
        this.sex=sex;
        flag = true;
        this.notify();
    }
    public synchronized void out(){
        if(!flag)
            try{this.wait();}catch (Exception e){}
        flag = false;
        this.notify();
        System.out.println(name+"......"+sex);
    }
}

class Input implements Runnable {

    private Res r;

    Input(Res r) {
        this.r = r;
    }

    public void run() {
        int x = 0;
        while (true) {
            if(x==0)
                r.set("ZhangSan","man");
            else
                r.set("丽丽","女");
            x = (x + 1) % 2;
        }
    }
}

class Output implements Runnable {
    private Res r;

    Output(Res r) {
        this.r = r;
    }

    public void run() {
        while (true) {
            r.out();
        }
    }
}

public class InputOutputDemo1 {
    public static void main(String[] args) {
        Res r = new Res();
        new Thread(new Input(r)).start();
        new Thread(new Output(r)).start();
        /**
         Input in = new Input(r);
         Output out = new Output(r);
         Thread t1 = new Thread(in);
         Thread t2 = new Thread(out);
         t1.start();
         t2.start();
         */

    }
}
