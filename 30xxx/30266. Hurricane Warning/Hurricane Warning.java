import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		for(int i = 1; i <= k; i++) {
			System.out.println("Data Set " + i + ":");

			int n = sc.nextInt();
			String board = sc.next();

			int cnt = 0;

			for(int j = 0; j < n; j++) {
				String person = sc.next();
				for(int l = 0; l < board.length(); l++) {
					if(person.contains(Character.toString(board.charAt(l)))) {
						cnt++;
						break;
					}
				}
			}

			System.out.println(cnt);
			System.out.println();
		}
		sc.close();
    }
}
