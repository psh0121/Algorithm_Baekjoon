import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String strA = String.join("", sc.nextLine().split(" "));
		String strB = String.join("", sc.nextLine().split(" "));

		BigInteger a = new BigInteger(strA);
		BigInteger b = new BigInteger(strB);

		if(a.compareTo(b) <= 0) System.out.println(a);
		else System.out.println(b);
		sc.close();
    }
}