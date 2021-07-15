public class Day03dowhile {
    public static void main(String[] args) {
        /*
         *定义初始化表达式；
         *do{
         *循环体（执行语句）；
         *}while（条件表达式）；
         */
        int x = 10;

        do {
            System.out.print("do x = " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);

    }
}
