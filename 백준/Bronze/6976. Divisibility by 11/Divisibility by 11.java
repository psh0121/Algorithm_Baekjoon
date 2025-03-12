import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            BigInteger num = sc.nextBigInteger();
            BigInteger modValue = num;

            StringBuilder sb = new StringBuilder();
            sb.append(modValue + "\n");

            while (modValue.toString().length() > 2) {
                String modValueStr = modValue.toString();
                String modValueStrLeft = modValueStr.substring(0, modValueStr.length() - 1);
                String modValueStrRight = Character.toString(modValueStr.charAt(modValueStr.length() - 1));

                modValue = new BigInteger(modValueStrLeft).subtract(new BigInteger(modValueStrRight));
                sb.append(modValue + "\n");
            }

            if(modValue.compareTo(BigInteger.valueOf(11)) == 0) {
                sb.append("The number " + num + " is divisible by 11.");
            }
            else {
                sb.append("The number " + num + " is not divisible by 11.");
            }

            System.out.println(sb.toString());
            if (i < n - 1) System.out.println();
        }
        sc.close();
    }
}