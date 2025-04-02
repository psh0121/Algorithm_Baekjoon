import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static BigInteger factorial (int num) {
        if(num <= 1) return BigInteger.ONE;

        return BigInteger.valueOf(num).multiply(factorial(num - 1));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger factN = factorial(n);

        String value = factN.toString();

        int cnt = 0;

        for(int i = value.length() - 1; i >= 0; i--) {
            char c = value.charAt(i);

            if(c == '0') cnt++;
        }

        System.out.println(cnt);
        sc.close();
    }
}