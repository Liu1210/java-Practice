class LanPingException extends Exception {
    LanPingException(String message) {
        super(message);
    }
}

class MaoYanException extends Exception {
    MaoYanException(String message) {
        super(message);
    }
}

class NoPlanException extends Exception {
    NoPlanException(String msg) {
        super(msg);
    }
}

class Computer {
    private int state = 3;

    public void run() throws LanPingException, MaoYanException {
        if (state == 2)
            throw new LanPingException("蓝屏");
        if (state == 3)
            throw new MaoYanException("冒烟");
        System.out.println("电脑运行");
    }

    public void reset() {
        state = 1;
        System.out.println("电脑重启");
    }
}

class Teacher {
    private String name;
    private Computer cmpt;

    Teacher(String name) {
        this.name = name;
        cmpt = new Computer();
    }

    public void prelect() throws NoPlanException {
        try {
            cmpt.run();
        } catch (LanPingException e) {
            cmpt.reset();
        } catch (MaoYanException e) {
            test();
            throw new NoPlanException("课时无法继续");
        }
        System.out.println("讲课");
    }

    public void test() {
        System.out.println("练习");
    }
}

public class ExceptionTest {
    public static void main(String[] args) {
        Teacher t = new Teacher("老师");
        try {
            t.prelect();
        } catch (NoPlanException e) {
            System.out.println(e.toString());
            System.out.println("换老师或者放假");
        }
    }
}
