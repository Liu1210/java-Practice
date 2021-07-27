class NoValueException extends Exception {
    NoValueException(String message) {
        super(message);
    }
}

interface Shape {
    void getArea();
}

class Rec implements Shape {
    private int len, wid;

    Rec(int len, int wid) throws NoValueException {
        if (len <= 0 || wid <= 0)
            throw new NoValueException("出现非法值");
        this.len = len;
        this.wid = wid;


    }

    public void getArea() {
        System.out.println(len * wid);
    }
}

class Circle implements Shape {
    private int radius;
    public static final double PI = 3.14;

    Circle(int radius) {
        if (radius <= 0)
            throw new RuntimeException("非法");
        this.radius = radius;
    }

    public void getArea() {
        System.out.println(radius * radius * PI);
    }
}

public class ExceptionTest1 {
    public static void main(String[] args) throws NoValueException {
        Rec r = new Rec(3, 4);
        r.getArea();
        System.out.println("over");
    }

}


