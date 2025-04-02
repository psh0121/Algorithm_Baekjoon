import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char b = sc.next().charAt(0);

        for(int i = a+1; i <= 62; i++) {
            BigInteger num = BigInteger.valueOf(2).pow(i);

            String numStr = num.toString();

            if(b == numStr.charAt(0)) {
                System.out.println(i);
                return;
            }
        }

        System.out.println(0);
        sc.close();
    }
}