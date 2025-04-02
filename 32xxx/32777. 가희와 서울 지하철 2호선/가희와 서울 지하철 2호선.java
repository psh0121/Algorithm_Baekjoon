import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();

		for(int i = 0; i < q; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			int inner = 0;
			int outer = 0;

			if(a < b) {
				inner = b - a;
				outer = (a - 200) + (243 - b);
			}
			else {
				inner = (243 - a) + (b - 200);
				outer = a - b;
			}

			if(inner < outer) System.out.println("Inner circle line");
			else if(inner == outer) System.out.println("Same");
			else System.out.println("Outer circle line");
		}
		sc.close();
    }
}
