/**
 * 对多异常的处理：
 * 1、声明异常时，建议声明为具体的异常，这样处理的可以更具体。
 * 2.对方声明几个异常，就对应有几个catch块，不要定义多余的catch块。
 * 如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面。
 * 建议在进行catch处理时，catch中一定要定义具体处理方式。
 * 不要简单定义一句e.printStackTrace().
 * 也不要简单的就书写一条输出语句。
 */
class Demo2 {
    int div(int a, int b) throws ArithmeticException,ArrayIndexOutOfBoundsException//在功能上通过throws的关键字申明了该功能有可能会出现问题
    {
        int[] arr =new int[a];
        System.out.println(arr[4]);
        return a / b;
    }
}

public class ExceptionDemo2 {
    public static void main(String[] args) //throws Exception
    {
        Demo2 d = new Demo2();
        try{
            int x = d.div(5, 0);
            System.out.println("x=" + x);
        }
        /**
        catch (Exception e){
            System.out.println("haha:"+e.toString());
        }
         */
        catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("除零了");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
            System.out.println("角标越界");
        }

        System.out.println("over");
    }
}
