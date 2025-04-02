import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		int t = sc.nextInt();

		int distance = Math.abs(a - c) + Math.abs(b - d);

		if(t < distance){
			System.out.println("N");
			return;
		}

		if(distance % 2 == 1) {
			if(t % 2 == 1) System.out.println("Y");
			else System.out.println("N");
		}
		else {
			if(t % 2 == 0) System.out.println("Y");
			else System.out.println("N");
		}

		sc.close(); 
    }
}
