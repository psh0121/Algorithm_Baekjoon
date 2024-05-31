import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;

		for(int i = 1; i <= n; i++) {
			String strI = Integer.toString(i);

			for(int j = 0; j < strI.length(); j++) {
				if(strI.charAt(j) == '3') cnt++;
				else if(strI.charAt(j) == '6') cnt++;
				else if(strI.charAt(j) == '9') cnt++;
			}
		}

		System.out.println(cnt);
    	sc.close();
    }
}