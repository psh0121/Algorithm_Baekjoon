import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int d1 = sc.nextInt();
		int d5 = sc.nextInt() * 5;
		int d10 = sc.nextInt() * 10;
		int d20 = sc.nextInt() * 20;
		int d50 = sc.nextInt() * 50;
		int d100 = sc.nextInt() * 100;

		int maxNum = Math.max(Math.max(d1, Math.max(d5, d10)), Math.max(d20, Math.max(d50, d100)));

		if(maxNum == d100) {
			System.out.println(100);
			return;
		}
		else if (maxNum == d50) {
			System.out.println(50);
			return;
		}
		else if (maxNum == d20) {
			System.out.println(20);
			return;
		}
		else if (maxNum == d10) {
			System.out.println(10);
			return;
		}
		else if (maxNum == d5) {
			System.out.println(5);
			return;
		}
		else {
			System.out.println(1);
		}
        sc.close();
    }
}
