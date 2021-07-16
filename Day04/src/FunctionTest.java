public class Functiontest {
    public static int getResult(int num) {
        return num * 3 + 5;
    }

    public static void main(String[] args) {
        int x = getResult(8);
        System.out.print("x=" + x);
        System.out.print("\n");
        int y = getResult(5);
        System.out.print("y=" + y);
    }


}
