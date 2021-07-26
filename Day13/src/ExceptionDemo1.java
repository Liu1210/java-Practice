class Demo1 {
    int div(int a, int b) throws Exception//在功能上通过throws的关键字申明了该功能有可能会出现问题
    {
        return a / b;
    }
}

public class ExceptionDemo1 {
    public static void main(String[] args) //throws Exception
     {
        Demo1 d = new Demo1();
        try{
            int x = d.div(4, 0);
            System.out.println("x=" + x);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
        System.out.println("over");
    }
}
