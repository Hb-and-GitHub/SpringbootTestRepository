package com.hb.demo.test_hb;

public class Test008 {

    static boolean foo(char c){
        System.out.print(c);
        return true;
    }
    public static void main(String[] args) {
        int i =0;
        for(foo('A');foo('B')&&(i<2);foo('C')){
            i++;
            foo('D');
        }
    }
}

 class Test{
    private static int i=1;
    public int getNext(){
        return i++;
    }
    public static void main(String [] args){
        byte y =11;
        byte x = (byte) ((byte)y+y);
        byte c = 1;
        c+=y;
//        c=c+y;
//        long c = 123L;
        float v = 0.1234f;
        double v1 = -5 + 1 / 4 + 2 * -3 + 5.0;
        Test test=new Test();
        Test testObject=new Test();
        test.getNext();
        testObject.getNext();
        System.out.println(testObject.getNext());
    }
}

class Test1 {
    static int x=10;
    static {x+=5;}
    public static void main(String[] args) //4
    {
        int a = '2';
        System.out.println("x="+x);
        double d1=-0.5;
        System.out.println("Ceil d1="+Math.ceil(d1));
        System.out.println("floor d1="+Math.floor(d1));
    }
    static{x/=3;};
}//9

 class Person{
     String name = "Person";
     int _a = 1;
     int $a = 1;
    int age=0;
}
 class Child extends Person{
    public String grade;
    public static void main(String[] args){
        Person p = new Child();
        System.out.println(p.name);
        int[] arr = new int[10];
        System.out.println(arr[0]);
    }
}

class Testt {
    public static void main(String args[]) {
        int i = 7;
        do {
            System.out.println(--i);
            --i;
        } while (i != 0);
        System.out.println(i);
    }
}

class test001{

    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1 + 1][n2 + 1];
        // dp[0][0...n2]的初始值
        for (int j = 1; j <= n2; j++)
            dp[0][j] = dp[0][j - 1] + 1;
        // dp[0...n1][0] 的初始值
        for (int i = 1; i <= n1; i++) dp[i][0] = dp[i - 1][0] + 1;
        // 通过公式推出 dp[n1][n2]
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                // 如果 word1[i] 与 word2[j] 相等。第 i 个字符对应下标是 i-1
                if (word1.charAt(i - 1) == word2.charAt(j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i][j - 1]), dp[i - 1][j]) + 1;
                }
            }
        }
        return dp[n1][n2];
    }

}

