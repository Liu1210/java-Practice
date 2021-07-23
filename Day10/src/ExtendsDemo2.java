class Fu {
    int num = 4;
}

class Zi extends Fu {
    //int num=5;
    void show() {
        System.out.println(super.num);
    }
}

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.show();
        //System.out.println(z.num + "...." + z.num);
    }
}
