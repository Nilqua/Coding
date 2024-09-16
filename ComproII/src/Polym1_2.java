//Polym1-2
class Shape {
    String msg = "Shape msg";
    void draw() {
    }

    void draw2() {
        System.out.println("msg = " + msg);
    }
}

class RndRect extends Shape {
    String msg = "RndRect msg";

    void draw2() {
        System.out.println("msg = " + msg);
    }
}

class Daimond extends Shape {
    String msg = "Daimond msg";

    void draw2() {
        System.out.println("msg = " + msg);
    }
}

class Arrow extends Shape {
    @Override
    void draw() {
        System.out.println("I am Arrow");
    }
}

class Text extends Shape {
    @Override
    void draw() {
        System.out.println("I am Text");
    }
}
class A extends Shape{}
class B extends A {}
public class Polym1_2 {
    public static void main(String[] args) {
        Shape[] ss = new Shape[4];
        ss[0] = new RndRect();
        ss[1] = new Daimond();
        ss[2] = new Arrow();
        ss[3] = new Text();

        for (int i = 0; i < 4; ++i)
            System.out.println(ss[i].msg);

        for (int i = 0; i < 4; ++i)
            ss[i].draw2();
        B b = new B();
        System.out.println(ss[0] instanceof Shape);
        System.out.println(ss[1] instanceof A);
        System.out.println(b instanceof A);
        System.out.println(b instanceof Shape);
    }
}
