import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num8 = sc.next();

		BigInteger num10 = new BigInteger(num8, 8);
		
		String num2 = num10.toString(2);

		System.out.println(num2);

		sc.close();
    }
}
