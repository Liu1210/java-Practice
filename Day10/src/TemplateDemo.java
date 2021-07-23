abstract class GetTime{
    public void getTime(){
        long start = System.currentTimeMillis();
        runcode();
        long end = System.currentTimeMillis();
        System.out.print("毫秒："+(end-start));
    }
    public abstract void runcode();
}
class SubTime extends GetTime{
    public void runcode(){
        for(int x=0;x<4000;x++){
            System.out.println(x);
        }
    }
}
public class TemplateDemo {
    public static void main(String[] args){
        SubTime gt=new SubTime();
        gt.getTime();
    }
}
