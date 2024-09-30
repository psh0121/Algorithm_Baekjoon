import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int n = sc.nextInt();

		x1 -= x2;

		if(x1 < 0) {
			System.out.println("NO");
			return;
		}
		else if(x1 / 2 < n) {
			System.out.println("NO");
			return;
		}
		else if (x1 % 2 != 0) {
			System.out.println("NO");
			return;
		}

		System.out.println("YES");
		sc.close();
    }
}
