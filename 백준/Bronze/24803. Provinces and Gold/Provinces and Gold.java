import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		int s = sc.nextInt();
		int c = sc.nextInt();

		// 구매력
		int sum = g * 3 + s * 2 + c * 1;

		if (sum >= 8) {
            System.out.println("Province or Gold");
        } else if (sum >= 6) {
            System.out.println("Duchy or Gold");
        } else if (sum >= 5) {
            System.out.println("Duchy or Silver");
        } else if (sum >= 3) {
            System.out.println("Estate or Silver");
        } else if (sum >= 2) {
            System.out.println("Estate or Copper");
        } else {
            System.out.println("Copper");
        }

        sc.close();
    }
}
