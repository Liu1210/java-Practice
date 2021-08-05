/**
 * 什么时候使用重载：
 * 当定义的功能相同，但参与运算的未知内容不同时。
 * 定义一个函数名称以表示其功能，方便阅读，通过参数列表的不同来区分多个同名函数
 */
public class FunctionTest4 {
    public static void main(String[] args) {
        add(2, 3);
        add(2, 3, 4);
    }

    //定义一个加法运算，获取两个整数的和。
    public static int add(int a, int b) {
        return a + b;
    }

    //定义一个加法，获取三个整数的和。
    public static int add(int a, int b, int c) {
        return add(a, b) + c;
    }
}
