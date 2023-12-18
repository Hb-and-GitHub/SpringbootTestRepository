package com.hb.demo.test_hb;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class T010 {

    public static void main(String args[]) {
//        int x, y;
//        x = 5 >> 2;
//        y = x >>> 2;
//        System.out.println(y);
        System.out.println(13 & 17);
        double v = (short) 10 / 10.2 * 2;
    }
}

class C {
    C() {
        System.out.print("C");
    }
}

class Aa {
    C c = new C();

    Aa() {
        this("A");
        System.out.print("A");
    }

    Aa(String s) {
        System.out.print(s);
    }
}

class testt extends Aa {
    testt() {
        super("B");
        System.out.print("B");
    }

    public static void main(String[] args) {
        new testt();
    }
}

class Car {
    public String type;
    String No;
    private int heavy;
    double speed;
    protected String owner;
    public String price;
    private String color;

    public static void main(String[] args) {
        Car car = new Car();
        car.color = "q";
        car.heavy = 1;
        car.No = "q";
        car.price = "q";
        car.speed = 3.0;
        car.type = "q";
        int x =1;
        float y = 2;
        System.out.println(x/y);
        String s;
        int i;
        System.out.println("s=");
    }

}

class q{
    public static void main(String args[]) {
        List Listlist1 = new ArrayList();
        Listlist1.add(0);
        List Listlist2 = Listlist1;
        System.out.println(Listlist1.get(0) instanceof Integer);
        System.out.println(Listlist2.get(0) instanceof Integer);
    }
}

class test_1 {
    public static void main(String[] args) {
        System.out.println(test());
        test_1 test = null;
        test.hashCode();

    }
    private static int test() {
        int temp = 1;
        int _a = 1;
        int z =1;
        int FirstJavaApplet ;
        int _v;
        int Tre;
        try {
            System.out.println(temp);
            return ++temp;
        } catch (Exception e) {
            System.out.println(temp);
            return ++temp;
        } finally {
            ++temp;
            System.out.println(temp);
        }
    }
}

class SuperTest1 extends Date {
    private static final long serialVersionUID = 1L;
    private void test(){
        System.out.println(super.getClass().getName());
    }

    public static void main(String[]args){
        new SuperTest1().test();
    }
}

class Base1
{
    public void methodOne()
    {
        System.out.print("A");
        methodTwo();
    }

    public void methodTwo()
    {
        System.out.print("B");
    }
}

class Derived extends Base1
{
    public void methodOne()
    {
        super.methodOne();
        System.out.print("C");
    }

    public void methodTwo()
    {
        super.methodTwo();
        System.out.print("D");
    }
    public static void main(String[] args){

        Base1 b = new Derived();
        b.methodOne();
    }
}

 class Test2 {
    public static void hello() {
        System.out.println("hello");
    }
}
 class MyApplication {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Test2 test=null;
        test.hello();
    }
}

class Test_2
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 0;
        int k = 0;
        for (int z = 0; z < 5; z++) {
            if ((++x > 2) && (++y > 2) && (k++ > 2))
            {
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x + "””" +y + "”” "+k);
    }
}

class Inc {
    public static void main(String[] args) {
        Inc inc = new Inc();
        int i = 0;
        inc.fermin(i);
        i= i ++;
        System.out.println(i);

    }
    void fermin(int k){
        k++;
    }
}

