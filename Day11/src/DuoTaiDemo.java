abstract class Animal {
    public abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void KanJia() {
        System.out.println("看家");
    }
}

class Pig extends Animal {
    public void eat() {
        System.out.println("吃饲料");
    }

    public void Sleep() {
        System.out.println("睡觉");
    }
}

public class DuoTaiDemo {
    public static void main(String[] args) {
        //Animal a =new Cat();类型提升，向上转型
        //a.eat();
        //Cat c = (Cat)a;
        //c.catchMouse();
        //Animal b=new Dog();
        //b.eat();
        //Dog d=(Dog)b;
        //d.KanJia();
        //Cat c = new Cat();
        //Dog d =new Dog();
        //function(c);
        //function(new Dog());
        //function(new Pig());
        //Animal c=new Cat();
        //c.eat();
        //function(new Cat());
        //function(new Dog());
        //function(new Pig());
        function(new Cat());
        function(new Dog());
        function(new Pig());
    }

    public static void function(Animal a) {//Animal a = new Cat();
        a.eat();
        if (a instanceof Cat) {
            Cat c = (Cat) a;
            c.catchMouse();
        } else if (a instanceof Dog) {
            Dog c = (Dog) a;
            c.KanJia();
        } else if (a instanceof Pig) {
            Pig c = (Pig) a;
            c.Sleep();
        }
    }
    /**
     public static void function(Cat c){
     c.eat();
     }
     public static void function(Dog d){
     d.eat();
     }
     public static void function(Pig p){
     p.eat();
     */
}

