package loop.patterns;

public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        for(int i = 1; i<=n; i++){
            //Inner Loop
            for(int j = 1;j<=i;j++){
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println(" ");
        }

    }
}
