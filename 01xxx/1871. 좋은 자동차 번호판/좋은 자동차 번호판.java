import java.util.Scanner;

public class Main {
	public static long get26Num(String alphabet) {
		long result = 0;
		int gop = alphabet.length() - 1;

		for(int i = 0; i < alphabet.length(); i++) {
			int alphaNum = (int)alphabet.charAt(i) - 65;
			result += alphaNum * Math.pow(26, gop);
			gop--;
		}

		return result;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String[] numberBoard = sc.next().split("-");
			long front = get26Num(numberBoard[0]);
			long back = Integer.parseInt(numberBoard[1]);

			if(Math.abs(front-back) <= 100) System.out.println("nice");
			else System.out.println("not nice");
		}
		sc.close();
    }
}
