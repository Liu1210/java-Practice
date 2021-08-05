public class FunctionTest2 {
    public static void main(String[] args) {
        draw(5, 6);
        printHr();
        draw(8, 9);
        printHr();
    }

    /**
     * 定义一个功能，用于打印矩形
     * 思路：
     * 1，确定结果，没有，直接打印，返回值为void。
     * 2，未知内容？有，两个：矩形的行和列不确定。
     */
    public static void draw(int row, int col) {
        for (int x = 0; x < row; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printHr() {
        System.out.println("-----------");
    }
}