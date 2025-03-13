import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        int p = sc.nextInt();

        BigInteger calValue = n.pow(p);
        String strValue = calValue.toString();

        // 70자리씩 출력한다
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strValue.length(); i+=70) {
            sb.append(strValue.substring(i, Math.min(i+70, strValue.length()))).append("\n");
        }

        System.out.println(sb.toString().trim());
        sc.close();
    }
}