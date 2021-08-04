import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void sop(Object obj) {
        System.out.println(obj);
    }
    public static void main(String[] arge) {
        ArrayList al = new ArrayList();
        al.add("java01");
        al.add("java02");
        al.add("java03");
        sop("原集合是：" + al);
        al.add(1, "java09");

        //删除指定位置的元素
        //al.remove(2);
        //修改元素
        //al.set(2,"java007");

        //通过角标获取元素
        sop("get(1):" + al.get(1));
        sop(al);
        //获取所有元素
        for (int x = 0; x < al.size(); x++) {
            System.out.println("a;(" + x + ")=" + al.get(x));
        }
        Iterator it = al.iterator();
        while (it.hasNext()) {
            sop("next:" + it.next());
        }
        //通过indexOf获取对象的位置
        sop("indexOf="+al.indexOf("java02"));
        List sub=al.subList(1,3);
        sop("sub="+sub);
    }
}
