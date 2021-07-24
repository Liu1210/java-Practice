abstract class Student1 {
    public abstract void study();

    public void sleep() {
        System.out.println("躺着睡");
    }
}

class BaseStudent extends Student1 {
    public void study() {
        System.out.println("base study");
    }

    public void sleep() {
        System.out.println("趴着睡");
    }
}

class AdvStudent extends Student1 {
    public void study() {
        System.out.println("adv study");
    }
}


public class DuoTaiDemo2 {
    public static void main(String[] args) {
        DoStudent ds = new DoStudent();
        ds.doSome(new BaseStudent());
        ds.doSome(new AdvStudent());
    }
}
