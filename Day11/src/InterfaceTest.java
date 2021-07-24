abstract  class Student{
    abstract void study();
    void sleep(){
        System.out.println("sleep");
    }
}
interface Smoking{
    void smoke();
}
class ZhangSan extends Student implements Smoking{
    void study(){}
    public void smoke(){}
}
class LiSi extends Student{
    void study() {}
}
/**class Sporter{
    void play();
}
interface Study{
}
 class WangWu extends Sport implements Study{

 }
 */
public class InterfaceTest {
}
