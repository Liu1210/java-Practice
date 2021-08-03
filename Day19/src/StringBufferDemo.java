public class StringBufferDemo {
    public static void main(String[] args) {
        //method_update();
        StringBuffer sb = new StringBuffer("abcdef");
        char[] chs = new char[4];
        sb.getChars(1, 4, chs, 1);
        for (int x = 0; x < chs.length; x++) {
            sop("chs[" + x + "]=" + chs[x] + ";");
        }
    }

    public static void method_update() {
        StringBuffer sb = new StringBuffer("abcde");
        // sb.replace(1, 4, "java");
        sb.setCharAt(2, 'k');
        sop(sb.toString());
    }

    public static void method_del() {
        StringBuffer sb = new StringBuffer("abcde");
        // sb.delete(1, 3);
        //sb.delete(0,sb.length());
        //sb.delete(2,3);
        sb.deleteCharAt(2);
        sop(sb.toString());
    }

    public static void method_add() {
        StringBuffer sb = new StringBuffer();
        //sb.append("abc").append(true).append(34);
        //StringBuffer sb1 = sb.append(34);
        sb.insert(1, "qq");
        sop(sb.toString());
        //sop(sb1.toString());
    }

    public static void sop(String str) {
        System.out.println(str);
    }

}
