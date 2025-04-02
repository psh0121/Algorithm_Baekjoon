import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n % 2 == 0) System.out.println("I LOVE CBNU");
		else {
			if(n == 1) {
				System.out.println("*");
				return;
			}
			
			System.out.println("*".repeat(n));
			System.out.println(" ".repeat(n/2) + "*");

			int spaceCnt = n/2 - 1;
			int midSpaceCnt = 1;
			for(int i = 0; i < n/2; i++) {
				String str = "";
				str += " ".repeat(spaceCnt);
				str += "*";
				str += " ".repeat(midSpaceCnt);
				str += "*";

				System.out.println(str);

				spaceCnt--;
				midSpaceCnt += 2;
			}
		}
		sc.close();
    }
}
