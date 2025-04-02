import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 데이터 값을 파악해 점수를 더해서 값을 리턴한다.
		int result = 0;

		for(int i = 0; i < n; i++) {
			String board = sc.next();

			for(int j = 0; j < board.length(); j++) {
				char card = board.charAt(j);

				if(card == 'A') result += 4;
				else if(card == 'K') result += 3;
				else if(card == 'Q') result += 2;
				else if(card == 'J') result += 1;
			}
		}

		System.out.println(result);
		sc.close(); 
    }
}
