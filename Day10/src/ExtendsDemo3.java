class Fu1 {
    void show() {
        System.out.println("fu show");
    }

    void speak() {
        System.out.println("vb");
    }
}

class Zi1 extends Fu1 {
    void speak() {
        System.out.println("java");
    }

    public void show() {
        System.out.println("z show");
    }
}

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Zi1 z = new Zi1();
        z.speak();
    }
}

class Tel {
    void show() {
        System.out.println("number");
    }
}

class NewTel extends Tel {
    void shoe() {
        System.out.println("number");
        System.out.println("name");
        System.out.println("pic");
    }
}