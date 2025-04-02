import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();

		BigInteger num101 = new BigInteger(num1, 2);
		BigInteger num102 = new BigInteger(num2, 2);

		BigInteger sumNum = num101.add(num102);
		String binarySumNum = sumNum.toString(2);

		System.out.println(binarySumNum);
		sc.close();
    }
}
