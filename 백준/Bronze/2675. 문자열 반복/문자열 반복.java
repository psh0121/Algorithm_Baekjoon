import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			int repeatCount = sc.nextInt();
			String str = sc.next();

			String result = "";

			for(int j = 0; j < str.length(); j++) {
				result += Character.toString(str.charAt(j)).repeat(repeatCount);
			}

			System.out.println(result);
		}
		sc.close();
    }
}
