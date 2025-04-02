import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] cup = {1, 0, 0};
		String games = sc.next();

		for(int i = 0; i < games.length(); i++) {
			char game = games.charAt(i);
			int temp = 0;

			if(game == 'A') {
				temp = cup[0];
				cup[0] = cup[1];
				cup[1] = temp;
			}
			else if(game == 'B') {
				temp = cup[1];
				cup[1] = cup[2];
				cup[2] = temp;
			}
			else {
				temp = cup[0];
				cup[0] = cup[2];
				cup[2] = temp;
			}
		}

		if(cup[0] == 1) System.out.println(1);
		else if(cup[1] == 1) System.out.println(2);
		else System.out.println(3);
		sc.close();
    }
}
