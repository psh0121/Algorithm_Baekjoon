import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void solve (Scanner sc) {
        while (true) {
            String n = sc.next();
            String d = sc.next();

            if(n.equals("0") && d.equals("0")) break;

            String replaceN = d.replaceAll(n, "");
            replaceN = replaceN.length() == 0 ? "0" : replaceN;

            System.out.println(new BigInteger(replaceN));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        solve(sc);
        sc.close();
    }
}
