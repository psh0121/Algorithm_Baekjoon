import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split("/");

		int date0 = Integer.parseInt(date[0]);
		int date1 = Integer.parseInt(date[1]);

		if (date0 <= 12 && date1 <= 12) {
			System.out.println("either");
		}
		else if (date0 <= 12 && date1 <= 31) {
			System.out.println("US");
		}
		else System.out.println("EU");
        sc.close();
    }
}
