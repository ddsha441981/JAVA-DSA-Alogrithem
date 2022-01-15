package operators;

public class BitWiseOperator {
    public static void main(String[] args) {
        int a = 5;//->101
        int b = 6;//->110
        int c = a&b;//->100 -> 4

        int x = 10; //->1010
        int y = 13; //->1101

        int d = x|y; //->1111 -> 15

        System.out.println(c);
        System.out.println(d);
    }
}
