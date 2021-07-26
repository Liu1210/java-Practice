/**
 * 异常的处理
 * java提供了特有的语句进行处理。
 * try
 * {
 * 需要被检测的代码；
 * }
 * catch（异常类 变量）
 * {
 * 处理异常的代码；（处理方式）
 * }
 * finally{
 * 一定会执行的语句；
 * }
 */
class Demo {
    int div(int a, int b) {
        return a / b;
    }
}

public class ExceptionDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            int x = d.div(4, 0);
            System.out.println("x=" + x);
        } catch (Exception e) {//Exception e=new ArithmeticException();
            System.out.println("除零了");
            System.out.println(e.getMessage());//by zero;
            System.out.println((e.toString()));//异常名称：异常信息
        }
        System.out.println("over");//异常名称，异常信息出现的位置。
    }
}
