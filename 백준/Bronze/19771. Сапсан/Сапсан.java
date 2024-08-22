import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
		int halfseat = seat / 2;

		for(int i = seat; i >= 0; i -= 2) {
			if(i % 4 != 0) continue;

			int person = i;
			int twinPerson = person / 2 / 2;
			int liveHalfSeat = halfseat - twinPerson;

			if(liveHalfSeat >= person / 2) {
				System.out.println(person);
				return;
			}
		}
        sc.close();
    }
}
