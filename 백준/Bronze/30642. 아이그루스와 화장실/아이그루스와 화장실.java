import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String mascot = sc.next();
		int cur = sc.nextInt();

		if(mascot.equals("annyong")) {
			if(cur % 2 == 1) System.out.println(cur);
			else {
				if(cur + 1 > n) System.out.println(cur - 1);
				else System.out.println(cur + 1);
			}
		}
		else {
			if(cur % 2 == 0) System.out.println(cur);
			else {
				if(cur + 1 > n) System.out.println(cur - 1);
				else System.out.println(cur + 1);
			}
		}
		
		sc.close();
    }
}