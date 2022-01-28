package conditional;

public class Nested {
    public static void main(String[] args) {
        int a = 10;
        int b = 45;
        int c = 135;
        if (a>b){
            System.out.println("A is greater");
        }else{
            if(b>c){
                System.out.println("B is greater");
            }else{
                System.out.println("C is greater");
            }
        }
    }
}
