import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String hero = sc.nextLine();
			String lowerHero = hero.toLowerCase();
			int g = 0;
			int b = 0;

			for(int j = 0; j < hero.length(); j++) {
				char letter = lowerHero.charAt(j);
				if(letter == 'g') g++;
				else if(letter == 'b') b++;
			}

			if(g > b) System.out.println(hero + " is GOOD");
			else if(g == b) System.out.println(hero + " is NEUTRAL");
			else System.out.println(hero + " is A BADDY");

		}

		sc.close();
    }
}
