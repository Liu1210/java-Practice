import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        method_2();
    }
public static void method_get(){
    ArrayList a1 = new ArrayList();
    a1.add("java01");
    a1.add("java02");
    a1.add("java03");
    a1.add("java04");
    Iterator it = a1.iterator();//获取迭代器，用于去除集合中的元素

    while(it.hasNext()){
        sop(it.next());
    }
}
    public static void method_2() {
        ArrayList a11 = new ArrayList();
        a11.add("java01");
        a11.add("java02");
        a11.add("java03");
        a11.add("java04");

        ArrayList a12 = new ArrayList();
        a12.add("java05");
        a12.add("java04");
        a12.add("java05");
        a12.add("java06");

        a11.retainAll((a12));
        sop("a11:" + a11);
        sop("a12:" + a12);
    }

    public static void base_method() {
        //创建一个集合容器，使用Collection接口的子类。ArrayList
        ArrayList a1 = new ArrayList();
        //1，添加元素
        a1.add("java01");
        a1.add("java02");
        a1.add("java03");
        a1.add("java04");
        //打印原集合
        sop("原集合:" + a1);
        //3,删除元素
        //al.remove("java02");
        //al.chear();//清空集合。

        //4，判断元素。
        sop("java03是否存在:" + a1.contains("java03"));
        sop("集合是否为空？" + a1.isEmpty());
        //2，获取个数。集合长度
        sop(("suze:" + a1.size()));
        //打印改变后的集合
        sop(a1);
    }

    public static void sop(Object obj) {
        System.out.println(obj);
    }
}
