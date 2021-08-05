public class ArrayTest2 {
    public static void main(String[] srgs) {
        int[] arr = {2, 5, 7, 9, 8};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1)
                System.out.print(arr[x] + ",");
            else
                System.out.print(arr[x]);
        }
    }
}
