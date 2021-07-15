public class Day03while {
    public static void main(String[] args) {
        whileSample();
    }
        /**
         *定义初始化表达式；
         *while（条件表达式）；
         *{
         *循环体（执行语句）；
         *}
         */

    public static void whileSample() {
        int x = 5;
        while (x <= 20) {
            System.out.println("x=" + x);
            x++;
        }
    }
}
