package com.hb.demo.test_hb;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class T009 {
    public static void main(String[] args) {
        String s = "祝你考出好成绩!";
        System.out.println(s.length());
        Thread t = new Thread() {
            public void run() {
                pong(1);
            }
        };

        t.run();
        String str = "hello world";
        str += " a";
        str = str + 100;
        int num = str.length();
        System.out.print("ping");
    }

    static void pong(int a) {
        System.out.print("pong");
    }
}

class Example extends Thread {
    @Override

    public void run() {

        try {

            Thread.sleep(1000);

        } catch (InterruptedException e) {

            e.printStackTrace();

        }

        System.out.print("run");

    }

    public static void main(String[] args) {

        Example example = new Example();
        Map map = new HashMap<>();
        Map map1 = new TreeMap<>();
        Map map3 = new ConcurrentHashMap();
        Map map4 = Collections.synchronizedMap(new HashMap());
        example.run();
        TreeSet<Integer> set = new TreeSet<Integer>();
        TreeSet<Integer> subSet = new TreeSet<Integer>();
        for (int i = 606; i < 613; i++) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        subSet = (TreeSet) set.subSet(608, true, 611, true);
        set.add(609);
        System.out.println(set + " " + subSet);

        System.out.print("main");

    }
}

class father {
    public father() {

    }

    double d = 5.3e12;
    float f = 1.1f;
    int i = 1;
    double dd = 3;
    private String name = "abc";

    public static void main(String[] args) {
        father test = new father();
        father testB = new father();
        String result = test.equals(testB) + ",";
        result += test.name.equals(testB.name) + ",";
        result += test.name == testB.name;
        List<Integer> integers = Arrays.asList(0, 1, 2, 3);
        Integer in = new Integer(0);
        for (Integer i : integers) {
            if (i.equals(in)) {
                System.out.println("yes");
            }
        }
        System.out.println(result);
    }
}

class Son extends father {
    Son son = (Son) new father();

    public Son() {
        super();
    }

    public static void main(String args[]) {
        Thread t = new Thread() {
            public void run() {
                dianping();

            }
        };
        t.start();
        System.out.print("dazhong");
    }

    static void dianping() {
        System.out.print("dianping");
    }
}

class MyClass {
    long var;

    public void MyClass(long param) {
        var = param;
    }//(1)

    public static void main(String[] args) {
        MyClass a, b;
        a = new MyClass();//(2)
        b = new MyClass();//(3)
        long round = Math.round(11.5);
    }
}

class Demo {
    public static void main(String[] args) {
        System.out.print(getNumber(0));
        System.out.print(getNumber(1));
        System.out.print(getNumber(2));
        System.out.print(getNumber(4));
    }

    public static int getNumber(int num) {
        try {
            int result = 2 / num;
            return result;
        } catch (Exception exception) {
            return 0;
        } finally {
            if (num == 0) {
                return -1;
            }
            if (num == 1) {
                return 1;
            }
        }
    }
}

class Demo1 {
    public static void main(String[] args) {
        Collection<?>[] collections =
                {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
        Super subToSuper = new Sub();
        for (Collection<?> collection : collections) {
            System.out.println(subToSuper.getType(collection));
        }
    }

    abstract static class Super {
        public static String getType(Collection<?> collection) {
            return "Super:collection";
        }

        public static String getType(List<?> list) {
            return "Super:list";
        }

        public String getType(ArrayList<?> list) {
            return "Super:arrayList";
        }

        public static String getType(Set<?> set) {
            return "Super:set";
        }

        public String getType(HashSet<?> set) {
            return "Super:hashSet";
        }
    }

    static class Sub extends Super {
        public static String getType(Collection<?> collection) {
            return "Sub";
        }
    }
}

class ZeroTest {
    String s;

    public static void main(String[] args) {
        String s = "a" + "b" + 333;
        try {
            String xx;
            System.out.print("");
        } catch (Exception e) {
            System.out.print(1);
            throw new RuntimeException();
        } finally {
            System.out.print(2);
        }
        System.out.print(3);
    }
}

class Base {
    int w, x, y, z;

    public Base(int a, int b) {
        x = a;
        y = b;
    }

    public Base(int a, int b, int c, int d) {
// assignment x=a, y=b
        //Base(a,b);
        this(a, b);
        w = d;
        z = c;
    }

    int a = (int) 111.1f;
    int aa = 1;
    byte b = 127;
    long v = 012;
    float f = -412;
    float g = 412;
    float ccc = 412.000f;
    float ff = aa;
    int aaa = (int) f;
    Base base = new Base(1, 2, 3, 4);
}

class HelloB extends HelloA {
    public HelloB() {
    }

    {
        System.out.println("I’m B class");
    }

    static {
        System.out.println("static B");
    }

    public static void main(String[] args) {
        new HelloB();
    }
}

class HelloA {
    public HelloA() {
    }

    {
        System.out.println("I’m A class");
    }

    static {
        System.out.println("static A");
    }
}

 class a{

}

