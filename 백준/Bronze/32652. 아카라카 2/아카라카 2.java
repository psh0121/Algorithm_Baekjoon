import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n == 1) System.out.println("AKARAKA");
		else {
			System.out.println("AKARAKA" + "RAKA".repeat(n-1));
		}

		sc.close();
    }
}
