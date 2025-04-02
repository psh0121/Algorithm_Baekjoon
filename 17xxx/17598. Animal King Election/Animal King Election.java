import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lion = 0;
		int tiger = 0;

		for(int i = 0; i < 9; i++) {
			String vote = sc.next();

			if(vote.equals("Lion")) lion++;
			else tiger++;
		}

		System.out.println(lion > tiger ? "Lion" : "Tiger");
		sc.close();
    }
}