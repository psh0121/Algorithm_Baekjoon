import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		String result = "";
		for(int i = 1; i <= n; i++) {
			result += n;

			if(result.length() >= m) break;
		}
		result = n < m ? result : result.substring(0,m);
		
		System.out.println(result);
		sc.close();
    }
}
