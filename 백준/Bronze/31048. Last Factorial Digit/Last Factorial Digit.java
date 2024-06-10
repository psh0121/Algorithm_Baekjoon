import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int value = 1;

			for(int j = 1; j <= n; j++) {
				value *= j;
			}

			String strValue = Integer.toString(value);

			System.out.println(strValue.charAt(strValue.length() - 1));
		}
    	sc.close();
    }
}