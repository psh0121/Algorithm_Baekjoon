import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			String num = sc.next();
			int sum = 0;

			for(int j = 0; j < num.length(); j++) {
				int value = Character.getNumericValue(num.charAt(j));
				sum += value;
			}

			System.out.println(sum % 9 == 0 ? "YES" : "NO");
		}
		sc.close();
    }
}
