public class IntegerDemo {
    public static void sop(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        //整数类型的最大值
        sop("int max:" + Integer.MAX_VALUE);
        //将一个字符串转换成整数。
        int num = Integer.parseInt("123");//必须传入数字格式的字符串
        sop("num=" + (num + 4));
        sop(Integer.toBinaryString(-6));
        sop(Integer.toHexString(60));
        int x = Integer.parseInt("3c", 16);
        sop("x=" + x);
    }
}
