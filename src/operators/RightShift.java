package operators;

public class RightShift {

    public static void main(String[] args) {
        //Right Shiftting in bits
        //1101 rotate number from right side
        // 1101(13) -> 0110(6) - > 0011(3) -> 0001(1) -> 0000(0) // every time number will be divide by 2
        // 1010(10) ->0010(5) -> 0001(1) ->0000(0)
        int a = 10;
        int b = 13;
        int c =  b>>1;//2;//6
        int c1 = a>>1;
        System.out.println(c);
        System.out.println(c1);

    }
}
