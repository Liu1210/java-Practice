public class FunctionTest1 {
    /**
     * 如何定义一个函数：
     * 1，既然函数是一个独立的供暖，那么先明确该供暖的运算结果，因为这是在明确函数的返回值列表
     * 2，在明确在定义该功能的过程中是否需要未知的内容参与运算。因为实在明确函数的参数列表（参数的类型和参数的个数）。
     */
    public static int getSum(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int sum = getSum(4, 6);
        System.out.println("sum=" + sum);
        sum= getSum(7, 8);
        System.out.println("sum=" + sum);
    }
}
