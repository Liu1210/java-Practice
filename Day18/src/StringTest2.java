public class StringTest2 {
    public static void sop(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s = "        ab cd        ";
        sop("(" + s + ")");
        sop("(" + reverseString(s, 6, 7) + ")");

    }

    public static String reverseString(String s, int start, int end) {
        char[] chs = s.toCharArray();
        reverse(chs, start, end);
        return new String(chs);
    }

    public static String reverseString(String s) {
        return reverseString(s,0,s.length());
    }

    private static void reverse(char[] arr, int x, int y) {
        for (int start = x, end = y-1; start < end; start++, end--) {
            swap(arr, start, end);
        }
    }

    private static void swap(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}

