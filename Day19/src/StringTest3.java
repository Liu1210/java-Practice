public class StringTest3 {
    public static int getSubCount(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {
            sop1("str=" + str);
            str = str.substring(index + key.length());
            count++;
        }
        return count;
    }

    public static int getSubCount_2(String str, String key) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key, index)) != -1) ;
        {
            sop1("index=" + index);
            index = index + key.length();
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "kefkkesktrikk";
        sop1("count=" + getSubCount(str, "kk"));
    }

    public static void sop1(String str) {
        System.out.println(str);
    }
}
