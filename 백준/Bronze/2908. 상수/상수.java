import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String originStr1 = sc.next();
		String originStr2 = sc.next();

		StringBuilder reverseStr1 = new StringBuilder(originStr1).reverse();
		StringBuilder reverseStr2 = new StringBuilder(originStr2).reverse();

		int num1 = Integer.parseInt(reverseStr1.toString());
		int num2 = Integer.parseInt(reverseStr2.toString());

		System.out.println(num1 > num2 ? num1 : num2);

		sc.close();
    }
}
