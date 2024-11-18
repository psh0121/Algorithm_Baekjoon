import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String result = "";
			int num = sc.nextInt();
			double sqrtNum = Math.sqrt((double)num);

			if(num % 2 == 1) result += "O";
			if(sqrtNum == (int)sqrtNum) result += "S";

			System.out.println(result.length() == 0 ? "EMPTY" : result);
		}
		sc.close();
    }
}
