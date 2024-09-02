import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		char[] dec = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'T', 'J', 'Q', 'K'};
		int n = Integer.parseInt(sc.nextLine());

		for(int i = 0; i < n; i++) {
			String[] card = sc.nextLine().split(" ");
			int[] cnt = new int[13];

			for(int j = 0; j < card.length; j++) {
				for(int k = 0; k < dec.length; k++) {
					if(card[j].charAt(0) == dec[k]) {
						cnt[k]++;
						break;
					}
				}
			}

			Arrays.sort(cnt);

			System.out.println(cnt[12]);
		}
        sc.close();
    }
}
