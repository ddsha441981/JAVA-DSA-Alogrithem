package operators;

public class ArithmaticOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a+b;
//        int d = a++;
        int e = ++a;
//        System.out.println("a = " + a + " d " + d);
        System.out.println("a = " + a + " d " + e);
        System.out.println(c);
    }


}
