package loop;

public class Powers {
    public static void main(String[] args) {
        int num = 5;
        int power = 3;
        int result = 1;
        for (int i = 0; i < power; i++){
            result = result * num;
        }
        System.out.println(result);
    }
}
