import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		int b = sc.nextInt();

		int decimalValue = Integer.parseInt(n, b);

		System.out.println(decimalValue);

		sc.close();
    }
}
