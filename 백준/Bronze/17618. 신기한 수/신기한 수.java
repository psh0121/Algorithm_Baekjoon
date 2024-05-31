import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 1; i <= n; i++) {
			String strI = Integer.toString(i);
			int sum = 0;

			for(int j = 0; j < strI.length(); j++) {
				sum += Character.getNumericValue(strI.charAt(j));
			}

			if(i % sum == 0) cnt++;
		}

		System.out.println(cnt);
    	sc.close();
    }
}