class FuShuException extends Exception {
    private int value;

    FuShuException() {
        super();
    }

    FuShuException(String msg, int value) {
        super(msg);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

class Demo3 {
    int div(int a, int b) throws FuShuException {
        if (b < 0)
            throw new FuShuException("出现了除数是负数的情况----- /by fushu", b);
        return a / b;
    }
}

public class ExceptionDemo3 {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        try {
            int x = d.div(4, -9);
            System.out.println("x=" + x);
        } catch (FuShuException e) {
            System.out.println(e.toString());
            //System.out.println("除数出现负数");
            System.out.println("错误的负数是：" + e.getValue());
        }

        System.out.println("over");
    }
}