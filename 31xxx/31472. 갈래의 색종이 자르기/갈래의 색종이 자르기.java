import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int a = (int)Math.sqrt(w / 2) * 8;

		System.out.println(a);
		sc.close();
    }
}