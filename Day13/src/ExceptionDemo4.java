class FuShuException1 extends RuntimeException{
    FuShuException1(String msg){
        super(msg);
    }
}
class Demo4{
    int div(int a,int b)throws Exception{
        if(b<0)
            throw new FuShuException1("出现了除数为负数");
        if(b==0)
            throw new ArithmeticException("被零除了");
        return a/b;
    }
}
public class ExceptionDemo4 {
    public static void main(String[] args){
        Demo d = new Demo();
        int x = d.div(4,-9);
        System.out.println("x="+x);
        System.out.println("over");
    }
}
