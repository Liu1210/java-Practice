class Test {
    private int age;

    public void setAge(int a) {
        if (a > 0 && a < 120) {
            age = a;
            speak();
        } else
            System.out.print("no");
    }


    public int getAge() {
        return age;
    }

    void speak() {
        System.out.print("age=" + age);
    }
}

public class ObjectTest2 {
    public static void main(String[] args) {
        Test p = new Test();
        p.setAge(-40);
    }
}
