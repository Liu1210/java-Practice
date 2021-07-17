public class ArrayTest9 {
    public static void main(String[] args) {
        toHex(-60);
    }

    public static void toHex(int num) {
        char[] chs = {'0', '1', '2', '3',
                '4', '5', '6', '7',
                '8', '9', 'A', 'B',
                'C', 'D', 'E', 'F'};

        char[] arr = new char[8];
        int pos = arr.length;
        while (num != 0) {
            int temp = num & 15;
            arr[--pos] = chs[temp];
            num = num >>> 4;
        }
        System.out.print("pos=" + pos);
        for (int x = pos; x < arr.length; x++) {
            System.out.print(arr[x] + ",");
        }
    }
}
