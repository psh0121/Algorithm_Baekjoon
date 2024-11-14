import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int p = sc.nextInt();
			int m = sc.nextInt();

			ArrayList<Integer> list = new ArrayList<>();

			for(int j = 0; j < p; j++) {
				int seatNum = sc.nextInt();
				if(!list.contains(seatNum)) list.add(seatNum);
			}

			System.out.println(p - list.size());
		}
		sc.close();
    }
}
