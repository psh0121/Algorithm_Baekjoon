import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int s = 0;

		for(int i = 0; i < n; i++) {
			s += sc.nextInt() * sc.nextInt();
		}

		System.out.println((int)(s / w));
		sc.close(); 
    }
}
