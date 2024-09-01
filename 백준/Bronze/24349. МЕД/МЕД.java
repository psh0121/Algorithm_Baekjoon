import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		String curHouse = "토끼";

		int sum = 0;

		for(int i = 2; i <= n; i++) {
			if(curHouse.equals("토끼")) {
				if(a < b) {
					sum += a;
					curHouse = "부엉이";
				}
				else {
					sum += b;
					curHouse = "이요르";
				}
			}
			else if (curHouse.equals("부엉이")) {
				if(a < c) {
					sum += a;
					curHouse = "부엉이";
				}
				else {
					sum += c;
					curHouse = "이요르";
				}
			}
			else {	// 이요르
				if(b < c) {
					sum += b;
					curHouse = "토끼";
				}
				else {
					sum += c;
					curHouse = "부엉이";
				}
			}
		}

		System.out.println((sum/100) + " " + (sum % 100));
        sc.close();
    }
}
