public class StringTest4 {
    public static String getMaxSubString(String s1, String s2) {
        String max = "", min = "";
        max = (s1.length() > s2.length()) ? s1 : s2;
        min = (max == s1) ? s2 : s1;
        sop2("max=" + max + "...min=" + min);
        for (int x = 0; x < min.length(); x++) {
            for (int y = 0, z = min.length() - x; z != min.length() + 1; y++, x++) {
                String temp = s2.substring(y, z);
                if (max.contains(temp))
                    return temp;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String s1 = "aabcwerthelloyuiodef";
        String s2 = "cvhellobnm";
        sop2(getMaxSubString(s1, s2));
    }

    public static void sop2(String str) {
        System.out.println(str);
    }
}