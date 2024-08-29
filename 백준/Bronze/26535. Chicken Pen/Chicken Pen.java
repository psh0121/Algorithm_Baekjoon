import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sqrtN = Math.sqrt(n);
		int ceilN = (int) Math.ceil(sqrtN);

		System.out.println("x".repeat(ceilN + 2));

		for(int i = 0; i < ceilN; i++) {
			System.out.println("x" + ".".repeat(ceilN) + "x");
		}

		System.out.println("x".repeat(ceilN + 2));
        sc.close();
    }
}
