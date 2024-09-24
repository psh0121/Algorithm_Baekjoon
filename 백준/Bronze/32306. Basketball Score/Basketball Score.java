import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int a2 = sc.nextInt();
		int a3 = sc.nextInt();

		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		int b3 = sc.nextInt();

		int sumA = a1 + a2 * 2 + a3 * 3;
		int sumB = b1 + b2 * 2 + b3 * 3;

		if(sumA > sumB) System.out.println(1);
		else if(sumA == sumB) System.out.println(0);
		else System.out.println(2);
		sc.close();
    }
}
