class Demo {
    private int num;

    Demo(int num) {
        this.num = num;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Demo))
            return false;
        Demo d = (Demo) obj;
        return this.num == d.num;
    }

    public String toString() {
        return "demo:" + num;
    }
}

class Person {
}

public class ObjectDemo {
    public static void main(String[] args) {
        Demo d1 = new Demo(4);
        System.out.println(d1.toString());
        Demo d2 = new Demo(7);
        System.out.println(d2.toString());
        //Demo d2 = new Demo(5);
        //Person p =new Person();
        //System.out.println(d1.equals(p));
        //Class c = d1.getClass();
        //System.out.println(c.getName());
        //System.out.println(c.getName()+"@@"+Integer.toHexString(d1.hashCode()));
        //System.out.println(d1.toString());
    }
}
