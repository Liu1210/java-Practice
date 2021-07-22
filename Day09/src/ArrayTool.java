/**
 * 静态的应用
 * 每一个应用程序都有共性的功能,可以将这些功能进行抽取,独立封装以便复用.
 * 程序说明书,java的说明书通过文档注释来完成.
 */

/**
 * 这是一个可以对数组进行操作的工具栏,该类中提供了:获取最值,排序等功能.
 * @author : 等风
 * @version : V1.8
 */
public class ArrayToo1 {
    /**
     * 空参数构造函数
     */
    public static int getMax(int[] arr) {
        int max = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[max])
                max = x;
        }
        return arr[max];
    }

    /**
     * 获取一个整形数组中的最小值.
     *
     * @param arr 接收一个int类型的数组.
     * @return 会返回一个该数组中最小值.
     */
    public static int getMin(int[] arr) {
        int min = 0;
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > arr[min])
                min = x;
        }
        return arr[min];
    }

    /**
     * 给int数组进行选择排序.
     *
     * @param arr 接收一个int类型的数组.
     */
    public static void selectSort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = x + 1; y < arr.length; y++) {
                if (arr[x] > arr[y]) {
                    swap(arr, x, y);
                }
            }
        }
    }

    /**
     * 给int数组进行冒泡排序.
     *
     * @param arr 接收一个int类型的数组.
     */
    public static void bubbleShort(int[] arr) {
        for (int x = 0; x < arr.length - 1; x++) {
            for (int y = 0; y < arr.length - x - 1; x++) {
                if (arr[y] > arr[y + 1]) {
                    swap(arr, y, y + 1);
                }
            }
        }
    }

    /**
     * 给数组中元素进行位置的置换.
     *
     * @param arr 接收一个int类型的数组.
     * @param a   要置换的位置.
     * @param b   要置换的位置.
     */
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    /**
     * 用于打包数组中的元素,打印形式是:[element1,element2,...]
     */
    public static void printArray(int[] arr) {
        System.out.print("{");
        for (int x = 0; x < arr.length; x++) {
            if (x != arr.length - 1)
                System.out.print(arr[x] + ",");
            else
                System.out.println(arr[x] + "}");
        }
    }
}
