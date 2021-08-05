public class FunctionTest5 {
    public static void main(String[] args) {
        print99(5);
    }

    public static void print99(int num) {
        for (int x = 1; x <= num; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
    }

    public static void print99() {
        print99(9);
    }
}
