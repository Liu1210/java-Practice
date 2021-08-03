public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer m = 120;
        Integer n = 128;
        sop("m==n:" + (m == n));
        Integer a = 127;
        Integer b = 127;
        sop("a==b:" + (a == b));
    }

    public static void method() {
        Integer x = new Integer("123");
        Integer y = new Integer(123);
        sop("x==y:" + (x == y));
        sop("x.equals(y):" + x.equals(y));
    }

    public static void sop(String str) {
        System.out.println(str);
    }
}
