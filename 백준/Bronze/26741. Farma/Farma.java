import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	// head
		int y = sc.nextInt();	// leg

		int b = (y - 2*x) / 2;
		int a = x - b;

		System.out.println(a + " " + b);
		sc.close(); 
    }
}
