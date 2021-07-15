public class Fortest {
    public static void main(String[] args) {
        int count = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 7 == 0)
                count++;
        }
        System.out.print("count=" + count);
    }
}
