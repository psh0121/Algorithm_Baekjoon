import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			int s = sc.nextInt();

			if(Math.abs(s-l) < Math.abs(s-r)) {
				System.out.println(Math.abs(s-l) * 2 + 1);
			}
			else {
				System.out.println(Math.abs(s-r) * 2);
			}
		}
		sc.close(); 
    }
}
