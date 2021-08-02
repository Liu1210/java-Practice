import java.util.Locale;

public class StringMethodDemo {
    public static void method_7(){
        String s="    helo Java";
        sop(s.toLowerCase());//将字符串转换为大写或者小写
        sop(s.toUpperCase());
        sop(s.trim());//将字符串两端的多个空格去除

    }
    public static void method_sub() {
        String s = "abcdef";
        sop(s.substring(2));
        sop(s.substring(2, 4));
    }

    public static void method_split() {
        String s = "张三,李四,王五";
        String[] arr = s.split(",");
        for (int x = 0; x < arr.length; x++) {
            sop(arr[x]);
        }
    }

    public static void method_replace() {
        String s = "hello java";
        String s1 = s.replace("java", "world");
        sop("s=" + s);
        sop("s1=" + s1);
    }

    public static void method_trans() {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f'};
        String s = new String(arr, 1, 3);
        sop("s=" + s);
        String s1 = "zxcvbnm";
        char[] chs = s1.toCharArray();
        for (int x = 0; x < chs.length; x++) {
            sop("ch=" + chs[x]);
        }
    }

    public static void method_is() {
        String str = "ArrayDemo.java";
        //判断文件名称是否是Array单词开头
        sop(str.startsWith("Array"));
        //判断文件名称是否是.java的文件。
        sop(str.endsWith(".java"));
        //判断文件中是否包含Demo
        sop(str.contains("Demo"));
    }

    public static void method_get() {
        String str = "abcdefacj";
        //打印长度
        sop(str.length());
        //根据索引获取字符
        sop(str.charAt(4));
        //根据字符获取索引
        sop(str.indexOf('a', 3));
        //反向索引一个字符出现的位置
        sop(str.lastIndexOf("a"));

    }

    public static void main(String[] args) {
        method_7();
        //method_sub();
        //method_split();
        //method_replace();
        //method_trans();
        //method_is();
        /**
         String s1 = "abc";
         String s2= new String("abc");
         String s3= "abc";
         System.out.println(s1==s2);
         System.out.println(s1==s3);
         */
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
