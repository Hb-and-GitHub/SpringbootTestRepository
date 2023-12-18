package com.hb.demo.test_hb;

public class T006 {
    public  static  void  main(String[] args) {

        B bb= new  B( "GG" );

    }
}
    class  A{

        static  int  a; //类变量

        String name;

        int  id;

        //静态代码块

        static {

            a=10;

            System. out .println( "这是父类的静态代码块" +a);

        }

        //构造代码块

        {

            id=11;

            System. out .println( "这是父类的构造代码块id:" +id);

        }

        A(){

            System. out .println( "这是父类的无参构造函数" );

        }

        A(String name){

            System. out .println( "这是父类的name" +name);

        }

    }

    class  B extends A{

        String name;

        static  int  b;

        static {

            b=12;

            System. out .println( "这是子类的静态代码块" +b);

        }

        B(String name) {

            super();

            this .name = name;

            System. out .println( "这是子类的name:" +name);

        }

    }





