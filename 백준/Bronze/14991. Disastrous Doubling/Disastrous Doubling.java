import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger[] b = new BigInteger[n];
        for(int i = 0; i < n; i++)b[i] = sc.nextBigInteger();

        BigInteger bacteria = BigInteger.ONE;
        BigInteger mod = BigInteger.valueOf(1_000_000_007);

        for(int i = 0; i < n; i++) {
            // 박테리아 증식후 필요한 만큼 빼버리기
            bacteria = bacteria.multiply(BigInteger.valueOf(2)).subtract(b[i]);

            if(bacteria.signum() == -1) {   // 음수라면
                System.out.println("error");
                sc.close();
                return;
            }
        }

        System.out.println(bacteria.mod(mod));
        sc.close();
    }
}