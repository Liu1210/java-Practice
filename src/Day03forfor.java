public class Day03forfor {
    public static void main(String[] args) {
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                System.out.print("ok");
            }
            System.out.println();
        }
        for (int x = 0; x < 5; x++) {
            for (int y = x; y < 5; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 1; x <= 5; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y);
            }
            System.out.println();
        }
        for (int x = 1; x <= 9; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(y + "*" + x + "=" + y * x + "\t");
            }
            System.out.println();
        }
        a:
        for (int x = 0; x < 3; x++) {
            n:
            for (int y = 0; y < 4; y++) {
                System.out.print("x=" + x);
                break n;
            }
        }
        for (int x = 0; x <= 10; x++) {
            if (x % 2 == 1)
                continue;
            System.out.print("x=" + x + " ");
        }
    }
}

