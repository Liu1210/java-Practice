public class Functiontest3 {
    public static void main(String[] args) {
        print99();
        print99();
    }

    /**
     * 定义一个打印99乘法表的函数。
     */
    public static void print99() {
        for (int x = 1; x < 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }
}
