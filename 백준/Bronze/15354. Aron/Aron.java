import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String befroeTurn = "";
		int myturn = 0;

		for(int i = 0; i < n; i++) {
			if(i == 0) {
				befroeTurn = sc.next();
				myturn++;
				continue;
			}

			String curTurn = sc.next();

			if(befroeTurn.equals(curTurn)) {
				continue;
			}
			else {
				befroeTurn = curTurn;
				myturn++;
			}
		}

		System.out.println(myturn + 1);
		sc.close();
    }
}