import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int dataNum = sc.nextInt();
			int day = sc.nextInt();

			System.out.println(dataNum + " " + ((day * (day+1)) / 2 + day));
		}
		sc.close();
    }
}